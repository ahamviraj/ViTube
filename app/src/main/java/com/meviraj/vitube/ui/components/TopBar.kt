package com.meviraj.vitube.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TopBar() {

    CenterAlignedTopAppBar(
        title = {
            Text("ViTube")
        }
    )

}