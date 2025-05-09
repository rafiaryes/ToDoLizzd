package com.rafiarya0114.todolizzd.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rafiarya0114.todolizzd.model.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDb : RoomDatabase() {
    abstract val dao: TaskDao

    companion object {

        @Volatile
        private var INSTANCE: TaskDb? = null

        fun getInstance(context: Context): TaskDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TaskDb::class.java,
                        "task.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}