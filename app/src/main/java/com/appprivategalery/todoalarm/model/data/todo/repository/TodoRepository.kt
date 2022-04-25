package com.appprivategalery.todoalarm.model.data.todo.repository

import androidx.lifecycle.LiveData
import com.appprivategalery.todoalarm.model.data.Todo
import com.appprivategalery.todoalarm.model.data.todo.dao.TodoDao

class TodoRepository(private val todoDao: TodoDao) {
    val readAllData: LiveData<List<Todo>> = todoDao.readAllData()

    fun addTodo(todo: Todo){
        todoDao.addTodo(todo)
    }

    fun updateTodo(todo: Todo){
        todoDao.updateTodo(todo)
    }

    fun deleteTodo(todo: Todo){
        todoDao.deleteTodo(todo)
    }
}