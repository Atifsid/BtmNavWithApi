package com.example.btmnavwapi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.btmnavwapi.ui.theme.BtmNavWApiTheme
import com.feature.module1.ui.screens.ProductDetailsScreen
import com.feature.module1.ui.viewmodel.ProductDetailsViewModel
import com.feature.module2.ui.screens.Screen2
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BtmNavWApiTheme {
                // A surface container using the 'background' color from the theme
                MainScreenView()
            }
        }
    }
}

@Composable
fun MainScreenView(){
    val navController = rememberNavController()
    val items = listOf(
        BottomNavItem.Screen1,
        BottomNavItem.Screen2
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.arguments?.getString("screen1_nested_route")
                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentRoute == item.route,
                        label = { Text(text = item.title) },
                        icon = { Icon(imageVector = item.icon, contentDescription = null) },
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.startDestinationRoute!!){
                                    saveState = true
                                }
                                launchSingleTop = true
                            }
                        })
                }
            }
        }
    ) {
        Log.d("TAG", "MainScreenView: ${it}")
        NavHost(navController = navController, startDestination = BottomNavItem.Screen1.route){
            composable(BottomNavItem.Screen1.route){
                val viewModel = hiltViewModel<ProductDetailsViewModel>()
                ProductDetailsScreen(viewModel = viewModel)
            }
            composable(BottomNavItem.Screen2.route){
                Screen2()
            }
        }
    }
}

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Screen1 : BottomNavItem("product_details_route", "Screen1", Icons.Default.Home)
    object Screen2 : BottomNavItem("screen2_route", "Screen1", Icons.Default.AccountCircle)
}