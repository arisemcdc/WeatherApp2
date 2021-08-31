package com.example.weatherapp2

import android.app.Application
import com.example.weatherapp2.data.Repository.Repository

class WeatherApp2: Application() {
    companion object {
        lateinit var repository: Repository
    }

    override fun onCreate() {
        super.onCreate()
        repository = Repository()
    }
}