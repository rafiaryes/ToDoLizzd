package com.rafiarya0114.todolizzd.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rafiarya0114.todolizzd.database.TaskDao
import com.rafiarya0114.todolizzd.model.Task
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel (dao: TaskDao): ViewModel() {
    val data: StateFlow<List<Task>> = dao.getTask().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )


}