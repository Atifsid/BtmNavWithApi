package com.feature.module1.ui

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.feature_api.FeatureNavApi
import com.core.common.navcontants.ProductDetailsFeature
import com.feature.module1.ui.screens.ProductDetailsScreen
import com.feature.module1.ui.viewmodel.ProductDetailsViewModel

internal object InternalProductDetailsNavApi: FeatureNavApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(startDestination = ProductDetailsFeature.productDetailsRoute, route = ProductDetailsFeature.nestedRoute){
            composable(ProductDetailsFeature.productDetailsRoute){
                val viewModel = hiltViewModel<ProductDetailsViewModel>()
                ProductDetailsScreen(viewModel)
            }
        }
    }
}