package com.example.interview.Repository

import com.example.interview.ToDoAPI
import com.example.moengage.Article
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val toDoAPI: ToDoAPI) {
    private val articleList = MutableStateFlow<List<Article>>(emptyList())

    val _toDoList: StateFlow<List<Article>>
        get() = articleList

    suspend fun getToDoList() {

        val response = toDoAPI.getRoot().body()
        if (response?.status.equals("ok") && response != null) {
            articleList.emit(response.articles)
        }
    }
}