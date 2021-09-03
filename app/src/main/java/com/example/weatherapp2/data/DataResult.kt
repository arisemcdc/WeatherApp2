package com.example.weatherapp2.data

import java.lang.Exception

sealed class DataResult <out R> {
    data class Success<out T>(val data: T): DataResult<T>()
    data class Error(val exception: Exception): DataResult<Nothing>()
}