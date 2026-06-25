package com.meviraj.vitube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.meviraj.vitube.ui.ViTubeApp
import com.meviraj.vitube.ui.theme.ViTubeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            ViTubeTheme {
                ViTubeApp()
            }
        }
    }
}