package com.rafiarya0114.todolizzd.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.rafiarya0114.todolizzd.model.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Query("SELECT * FROM task ORDER BY priority DESC")
    fun getTask(): Flow<List<Task>>

    @Query("SELECT * FROM task WHERE id = :id")
    suspend fun getTaskById(id: Long): Task?

    @Query("DELETE FROM task WHERE id = :id")
    suspend fun deleteById(id: Long)


}