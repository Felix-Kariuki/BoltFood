package com.flexcode.boltfood.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.flexcode.boltfood.navigation.bottomNavigation.BottomBar
import com.flexcode.boltfood.navigation.bottomNavigation.BottomNavGraph
import kotlinx.coroutines.launch

@Composable
fun MainScreen(navController: NavHostController) {
    val scaffoldState = rememberScaffoldState()


    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomBar(
                navController = navController,
                modifier = Modifier
                    .background(Color.White)
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues = paddingValues)) {
            BottomNavGraph(
                navController = navController,
                modifier = Modifier.background(Color.White)

            )
        }

    }

}