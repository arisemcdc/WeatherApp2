package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class RequestX(
    val language: String,
    val query: String,
    val type: String,
    val unit: String
)