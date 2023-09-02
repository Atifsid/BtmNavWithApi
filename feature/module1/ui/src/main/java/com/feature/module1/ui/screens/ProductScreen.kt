package com.feature.module1.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.feature.module1.ui.viewmodel.ProductDetailsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailsScreen(viewModel: ProductDetailsViewModel) {
    val result = viewModel.productDetails.value

    val id = viewModel.id.collectAsState()

    Scaffold(topBar = {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = id.value, onValueChange = {viewModel.setQuery(it)},
            colors = TextFieldDefaults.textFieldColors(disabledIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent),
            placeholder = { Text(text = "Enter Product Id") },
            trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) })
    }) {
        Log.d("TAG", "ProductDetailsScreen: ${it}")

        Log.d("TAG", "ProductDetailsScreenFinal: ${result}")

    }
}