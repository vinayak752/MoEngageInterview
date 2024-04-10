package com.example.interview.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.interview.Repository.ToDoRepository
import com.example.moengage.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ToDoListDetailViewModel @Inject constructor(private val repository: ToDoRepository) : ViewModel() {

    val toDoList : StateFlow<List<Article>>
        get() = repository._toDoList

    init {
        viewModelScope.launch {
            repository.getToDoList()
        }
    }
}