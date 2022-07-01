package com.anniljing.jetpackroom.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.anniljing.jetpackroom.entity.User

@Dao
interface UserDao {
    @Insert(onConflict = REPLACE)
    fun insertAll(vararg users: User)

    @Insert(onConflict = REPLACE)
    fun insert(user: User)

    @Delete()
    fun delete(vararg users: User)

    @Update(onConflict = REPLACE)
    fun updateUser(user: User)

    @Update(onConflict = REPLACE)
    fun updateUsers(vararg users: User)

    @Query("SELECT firstName,lastName from user WHERE firstName= :firstName")
    fun queryByFirstName(firstName: String)
}