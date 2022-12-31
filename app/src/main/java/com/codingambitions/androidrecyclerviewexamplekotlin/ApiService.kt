package com.codingambitions.androidrecyclerviewexamplekotlin

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("getUsers.php")
    fun getUsers(): Call<GetUsersResponse>

}