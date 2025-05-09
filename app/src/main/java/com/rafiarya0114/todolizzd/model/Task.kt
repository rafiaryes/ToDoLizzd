package com.rafiarya0114.todolizzd.model

data class Task(
    val id: Long,
    val title: String,
    val desc: String,
    val priority: String,
    val isDone: Boolean,
)
