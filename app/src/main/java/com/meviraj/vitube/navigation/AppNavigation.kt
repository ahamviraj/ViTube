package com.meviraj.vitube.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.meviraj.vitube.ui.home.HomeScreen
import com.meviraj.vitube.ui.music.MusicScreen
import com.meviraj.vitube.ui.onboarding.OnboardingScreen
import com.meviraj.vitube.ui.settings.SettingsScreen
import com.meviraj.vitube.ui.videos.VideosScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destination.Onboarding.route
    ) {

        composable(Destination.Onboarding.route) {
            OnboardingScreen(navController)
        }

        composable(Destination.Home.route) {
            HomeScreen(navController)
        }

        composable(Destination.Videos.route) {
            VideosScreen(navController)
        }

        composable(Destination.Music.route) {
            MusicScreen(navController)
        }

        composable(Destination.Settings.route) {
            SettingsScreen(navController)
        }

    }

}