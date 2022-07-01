package com.anniljing.jetpackroom.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "user", primaryKeys = ["firstName", "lastName"])
data class User(
    @ColumnInfo(name = "firstName") val firstName: String?,
    @ColumnInfo(name = "lastName") val lastName: String?
)
