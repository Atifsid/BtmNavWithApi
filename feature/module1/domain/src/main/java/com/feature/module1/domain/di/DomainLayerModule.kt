package com.feature.module1.domain.di

import com.feature.module1.domain.repo.ProductsRepo
import com.feature.module1.domain.use_cases.GetProductDetailsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {

    @Provides
    fun provideGetProductDetailsUseCase(productsRepo: ProductsRepo):GetProductDetailsUseCase {
        return GetProductDetailsUseCase(productsRepo)
    }

}