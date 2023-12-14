package com.jalcaraz.todoapp.addtasks.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDatabase: RoomDatabase() {
    // DAO: Interfaz que permite hacer las peticiones de SQL a Room
    abstract fun taskDao(): TaskDao
}