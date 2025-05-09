package com.rafiarya0114.todolizzd.navigation

sealed class Screen (val route: String){
    data object Home: Screen("mainScreen")
}