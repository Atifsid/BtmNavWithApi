package com.feature.module1.data.remote

import com.feature.module1.data.model.ProductDetailsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductsApiService {

    @GET("products/{id}")
    suspend fun getRemoteProductDetailsById(@Path("id") id: String): ProductDetailsResponse

}