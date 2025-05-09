package com.rafiarya0114.todolizzd.model

data class Task(
    val id: Long,
    val title: String,
    val desc: String,
    val priority: Int,
    val isDone: Boolean,
)
