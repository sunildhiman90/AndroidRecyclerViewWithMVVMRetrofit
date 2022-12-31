package com.codingambitions.androidrecyclerviewexamplekotlin


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserX(
    @Json(name = "added_on")
    val addedOn: String?,
    @Json(name = "email")
    val email: String?,
    @Json(name = "first_name")
    val firstName: String?,
    @Json(name = "id")
    val id: String?,
    @Json(name = "last_name")
    val lastName: String?,
    @Json(name = "mobile")
    val mobile: String?,
    @Json(name = "profile_picture")
    val profilePicture: String?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "updated_on")
    val updatedOn: String?
)