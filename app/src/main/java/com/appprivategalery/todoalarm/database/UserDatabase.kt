package com.appprivategalery.todoalarm.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.appprivategalery.todoalarm.model.data.todo.dao.TodoDao
import com.appprivategalery.todoalarm.model.data.user.dao.UserDao
import com.appprivategalery.todoalarm.model.data.Todo
import com.appprivategalery.todoalarm.model.data.User

@Database(entities = [User::class, Todo::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun todoDao(): TodoDao

    companion object{
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}