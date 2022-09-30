package com.flexcode.boltfood.navigation.bottomNavigation

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.flexcode.boltfood.screens.home.HomeScreen
import com.flexcode.boltfood.screens.orders.OrdersScreen
import com.flexcode.boltfood.screens.profile.ProfileScreen
import com.flexcode.boltfood.screens.search.SearchScreen

@Composable
fun BottomNavGraph(
    navController : NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreens.HomeScreen.route
    ){
        composable(
            BottomBarScreens.HomeScreen.route
        ){
            HomeScreen()
        }

        composable(
            BottomBarScreens.SearchScreen.route
        ){
            SearchScreen()
        }

        composable(
            BottomBarScreens.OrderScreen.route
        ){
            OrdersScreen()
        }

        composable(
            BottomBarScreens.ProfileScreen.route
        ){
            ProfileScreen()

        }
    }
}