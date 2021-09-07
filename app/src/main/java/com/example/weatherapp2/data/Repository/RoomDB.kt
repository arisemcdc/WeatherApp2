package com.example.weatherapp2.data.Repository

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import com.example.weatherapp2.data.response.Current

@Database(entities = [Current::class], version = 1)
abstract class RoomDB:RoomDatabase() {
    abstract fun currentWeatherDAO(): CurrentWeatherDAO
}