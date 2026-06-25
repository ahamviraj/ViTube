package com.meviraj.vitube.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ViTubeScaffold(
    navController: NavController,
    content: @Composable (PaddingValues) -> Unit
) {

    Scaffold(

        topBar = {
            TopBar()
        },

        bottomBar = {
            BottomBar(navController)
        }

    ) { padding ->

        content(padding)

    }

}