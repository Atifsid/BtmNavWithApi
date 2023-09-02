package com.feature.module1.ui.di

import com.core.feature_api.FeatureNavApi
import com.feature.module1.ui.navigation.ProductDetailsNavApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {

    @Provides
    fun provideProductDetailsNavApi(): FeatureNavApi{
        return ProductDetailsNavApiImpl()
    }

}