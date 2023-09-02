package com.feature.module1.domain.use_cases

import com.core.common_utils.resource.Resource
import com.feature.module1.domain.model.Product
import com.feature.module1.domain.repo.ProductsRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetProductDetailsUseCase(private val productsRepo: ProductsRepo) {

    operator fun invoke(id: String) : Flow<Resource<Product>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = productsRepo.getProductDetailsById(id)))
        } catch (e: Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }

}