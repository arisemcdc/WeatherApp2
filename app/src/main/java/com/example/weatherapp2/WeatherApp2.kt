package com.example.weatherapp2

import android.app.Application
import androidx.room.Room
/*import com.example.weatherapp2.data.Repository.Converters*/
import com.example.weatherapp2.data.Repository.Repository
import com.example.weatherapp2.data.Repository.RoomDB

class WeatherApp2: Application() {
    companion object {
        lateinit var repository: Repository
    }

    override fun onCreate() {
        super.onCreate()
       /* val db = Room.databaseBuilder(applicationContext, RoomDB::class.java, "db")
               .addTypeConverter(Converters())
                .build()*/
        repository = Repository()
    }
}