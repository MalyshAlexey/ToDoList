package com.appprivategalery.todoalarm.model.data.user.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.appprivategalery.todoalarm.model.data.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun addUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)



}