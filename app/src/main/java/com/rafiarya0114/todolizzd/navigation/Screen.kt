package com.rafiarya0114.todolizzd.navigation

import com.rafiarya0114.todolizzd.ui.screen.KEY_ID_TASK

sealed class Screen (val route: String){
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_TASK}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}