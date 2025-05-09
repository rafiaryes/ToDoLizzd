package com.rafiarya0114.todolizzd.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rafiarya0114.todolizzd.database.TaskDao
import com.rafiarya0114.todolizzd.model.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: TaskDao) : ViewModel() {
    fun insert(title: String, desc: String, priority: String, isDone: Boolean) {
        val task = Task(
            title = title,
            desc = desc,
            priority = priority,
            isDone = isDone
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(task)
        }
    }

    fun getTask(id: Long): Task? {
        return null
    }
}