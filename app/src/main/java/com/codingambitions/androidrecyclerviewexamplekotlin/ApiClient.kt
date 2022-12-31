package com.codingambitions.androidrecyclerviewexamplekotlin

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiClient {

    val httpClient by lazy {
        OkHttpClient()
            .newBuilder()
            .build()
    }

    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://dev.codingambitions.com/android/ecommerce/api/v1/")
            .client(httpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val apiService by lazy {
        retrofit.create(ApiService::class.java)
    }

}