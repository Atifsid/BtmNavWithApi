package com.feature.module1.data.repo

import com.feature.module1.data.mappers.toProduct
import com.feature.module1.data.remote.ProductsApiService
import com.feature.module1.domain.model.Product
import com.feature.module1.domain.repo.ProductsRepo

class RemoteProductsRepo(private val productsApiService: ProductsApiService) : ProductsRepo {

    override suspend fun getProductDetailsById(id: String): Product {
        return productsApiService.getRemoteProductDetailsById(id).toProduct()
    }

}