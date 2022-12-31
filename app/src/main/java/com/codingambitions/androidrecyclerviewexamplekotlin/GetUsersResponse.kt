package com.codingambitions.androidrecyclerviewexamplekotlin


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetUsersResponse(
    @Json(name = "message")
    val message: String?,
    @Json(name = "res")
    val res: String?,
    @Json(name = "users")
    val users: List<UserX>?
)