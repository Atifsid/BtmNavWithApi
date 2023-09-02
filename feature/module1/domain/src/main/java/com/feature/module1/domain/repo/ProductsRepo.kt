package com.feature.module1.domain.repo

import com.feature.module1.domain.model.Product

interface ProductsRepo {
    suspend fun getProductDetailsById(id: String) : Product
}