package com.meviraj.vitube.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.meviraj.vitube.navigation.BottomNavItem

@Composable
fun BottomBar(
    navController: NavController
) {

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Videos,
        BottomNavItem.Music,
        BottomNavItem.Settings
    )

    val backStack =
        navController.currentBackStackEntryAsState()

    NavigationBar {

        items.forEach { item ->

            val selected =
                backStack.value?.destination?.route == item.route

            NavigationBarItem(

                selected = selected,

                onClick = {
                    navController.navigate(item.route)
                },

                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },

                label = {
                    Text(item.title)
                }

            )

        }

    }

}