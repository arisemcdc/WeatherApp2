package com.example.weatherapp2.data.response


import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("2021-08-30")
    val x20210830: X20210830,
    @SerializedName("2021-08-31")
    val x20210831: X20210831,
    @SerializedName("2021-09-01")
    val x20210901: X20210901,
    @SerializedName("2021-09-02")
    val x20210902: X20210902,
    @SerializedName("2021-09-03")
    val x20210903: X20210903,
    @SerializedName("2021-09-04")
    val x20210904: X20210904,
    @SerializedName("2021-09-05")
    val x20210905: X20210905
)