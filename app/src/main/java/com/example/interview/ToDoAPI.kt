package com.example.interview

import com.example.moengage.Article
import com.example.moengage.Root
import retrofit2.Response
import retrofit2.http.GET

interface ToDoAPI {
    @GET("staticResponse.json")
    suspend fun getRoot() : Response<Root>
}