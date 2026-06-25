package com.meviraj.vitube.navigation

sealed class Destination(val route: String) {

    data object Onboarding : Destination("onboarding")

    data object Home : Destination("home")

    data object Videos : Destination("videos")

    data object Music : Destination("music")

    data object Settings : Destination("settings")

}