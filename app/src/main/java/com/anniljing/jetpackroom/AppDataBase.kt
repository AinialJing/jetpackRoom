package com.anniljing.jetpackroom

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anniljing.jetpackroom.dao.UserDao
import com.anniljing.jetpackroom.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
}