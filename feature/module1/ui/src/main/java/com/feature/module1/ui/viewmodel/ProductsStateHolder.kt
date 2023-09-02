package com.feature.module1.ui.viewmodel

import com.feature.module1.domain.model.Product

data class ProductsStateHolder(
    val isLoading:Boolean=false,
    val error:String="",
    val data:Product?=null
)