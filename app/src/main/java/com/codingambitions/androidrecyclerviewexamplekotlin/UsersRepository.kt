package com.codingambitions.androidrecyclerviewexamplekotlin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UsersRepository {

    val apiService by lazy {
        ApiClient.apiService
    }

    suspend fun getUsers(): List<UserX>{
        return withContext(Dispatchers.IO){
            val response = apiService.getUsers().execute()
            response?.body()?.users?: listOf()
        }
    }
}