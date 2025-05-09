package com.rafiarya0114.todolizzd.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String,
    val desc: String,
    val priority: String,
    val isDone: Boolean,
)
