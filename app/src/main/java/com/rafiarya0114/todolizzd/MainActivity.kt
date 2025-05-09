package com.rafiarya0114.todolizzd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rafiarya0114.todolizzd.navigation.SetupNavGraph
import com.rafiarya0114.todolizzd.ui.screen.MainScreen
import com.rafiarya0114.todolizzd.ui.theme.ToDoLizzdTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoLizzdTheme {
                SetupNavGraph()
            }
        }
    }
}

