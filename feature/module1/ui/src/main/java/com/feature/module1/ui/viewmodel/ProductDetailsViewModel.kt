package com.feature.module1.ui.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.common_utils.resource.Resource
import com.feature.module1.domain.use_cases.GetProductDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductDetailsViewModel @Inject constructor(private val getProductDetailsUseCase: GetProductDetailsUseCase) : ViewModel() {

    private val _productDetails = mutableStateOf(ProductsStateHolder())
    val productDetails:State<ProductsStateHolder> get() = _productDetails

    private val _id:MutableStateFlow<String> = MutableStateFlow("")
    val id: StateFlow<String> get() = _id

    fun setQuery(s:String) {
        _id.value = s
    }

    init {
        viewModelScope.launch { _id.debounce(1000).collectLatest {
            getProductDetails(it)
        } }
    }

    fun getProductDetails(id: String) {
        getProductDetailsUseCase(id).onEach {
            when(it) {
                is Resource.Loading -> { _productDetails.value = ProductsStateHolder(isLoading = true) }
                is Resource.Error -> { _productDetails.value = ProductsStateHolder(error = it.message.toString()) }
                is Resource.Success -> { _productDetails.value = ProductsStateHolder(data = it.data) }
            }
        }.launchIn(viewModelScope)
    }

}