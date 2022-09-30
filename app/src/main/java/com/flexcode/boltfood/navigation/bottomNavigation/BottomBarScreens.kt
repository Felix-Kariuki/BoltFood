package com.flexcode.boltfood.navigation.bottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreens(
    val route:String,
    val title:String,
    val outlinedIcon: ImageVector,
    val filledIcon: ImageVector
){
    object HomeScreen : BottomBarScreens(
        route = "home",
        title = "Home",
        outlinedIcon = Icons.Default.Home,
        filledIcon = Icons.Default.Home
    )

    object SearchScreen : BottomBarScreens(
        route = "search",
        title = "Search",
        outlinedIcon = Icons.Default.Search,
        filledIcon = Icons.Default.Search
    )

    object OrderScreen : BottomBarScreens(
        route = "order",
        title = "Order",
        outlinedIcon = Icons.Default.BookmarkBorder,
        filledIcon = Icons.Default.BookmarkBorder
    )

    object ProfileScreen : BottomBarScreens(
        route = "profile_screen",
        title = "Profile",
        outlinedIcon = Icons.Default.Person,
        filledIcon = Icons.Default.Person
    )

}