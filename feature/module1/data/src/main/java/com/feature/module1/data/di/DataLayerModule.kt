package com.feature.module1.data.di

import com.feature.module1.data.remote.ProductsApiService
import com.feature.module1.data.repo.RemoteProductsRepo
import com.feature.module1.domain.repo.ProductsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {

    @Provides
    fun provideProductsApiService(retrofit: Retrofit) : ProductsApiService {
        return retrofit.create(ProductsApiService::class.java)
    }

    @Provides
    fun provideProductsRepo(productsApiService: ProductsApiService) : ProductsRepo {
        return RemoteProductsRepo(productsApiService)
    }

}
