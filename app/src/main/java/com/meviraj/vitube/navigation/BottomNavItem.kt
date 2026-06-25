package com.meviraj.vitube.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {

    data object Home : BottomNavItem(
        Destination.Home.route,
        "Home",
        Icons.Default.Home
    )

    data object Videos : BottomNavItem(
        Destination.Videos.route,
        "Videos",
        Icons.Default.Movie
    )

    data object Music : BottomNavItem(
        Destination.Music.route,
        "Music",
        Icons.Default.MusicNote
    )

    data object Settings : BottomNavItem(
        Destination.Settings.route,
        "Settings",
        Icons.Default.Settings
    )

}