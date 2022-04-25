package com.appprivategalery.todoalarm.model.data.user.repository

import androidx.lifecycle.LiveData
import com.appprivategalery.todoalarm.model.data.User
import com.appprivategalery.todoalarm.model.data.user.dao.UserDao

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    fun addUser(user: User){
        userDao.addUser(user)
    }

    fun updateUser(user: User){
        userDao.updateUser(user)
    }

    fun deleteUser(user: User){
        userDao.deleteUser(user)
    }


}