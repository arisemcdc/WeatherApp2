package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class X20210902(
    val astro: AstroXXX,
    val avgtemp: Int,
    val date: String,
    @SerializedName("date_epoch")
    val dateEpoch: Int,
    val maxtemp: Int,
    val mintemp: Int,
    val sunhour: Double,
    val totalsnow: Int,
    @SerializedName("uv_index")
    val uvIndex: Int
)