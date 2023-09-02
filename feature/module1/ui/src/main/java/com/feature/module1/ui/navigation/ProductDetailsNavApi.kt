package com.feature.module1.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureNavApi

interface ProductDetailsNavApi: FeatureNavApi {}

class ProductDetailsNavApiImpl : ProductDetailsNavApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {

    }

}