package com.core.feature_api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController

interface FeatureNavApi {
    fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder)
}