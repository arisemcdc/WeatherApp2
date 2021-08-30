package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class X20210905(
    val astro: AstroXXXXXX,
    val avgtemp: Int,
    val date: String,
    @SerializedName("date_epoch")
    val dateEpoch: Int,
    val maxtemp: Int,
    val mintemp: Int,
    val sunhour: Int,
    val totalsnow: Int,
    @SerializedName("uv_index")
    val uvIndex: Int
)