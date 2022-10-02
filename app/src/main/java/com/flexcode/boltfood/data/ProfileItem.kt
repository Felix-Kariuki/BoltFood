package com.flexcode.boltfood.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class ProfileItem(
    val image: ImageVector,
    val text: String,
)

val profileList = listOf(
    ProfileItem(
        Icons.Default.CreditCard,
        "Payment"
    ),
    ProfileItem(
        Icons.Default.Tag,
        "Promo codes"
    ),
    ProfileItem(
        Icons.Default.Person,
        "Profile"
    ),
    ProfileItem(
        Icons.Default.Settings,
        "Settings"
    ),
    ProfileItem(
        Icons.Default.Help,
        "About"
    ),
    ProfileItem(
        Icons.Default.HelpCenter,
        "Help"
    ),
)
