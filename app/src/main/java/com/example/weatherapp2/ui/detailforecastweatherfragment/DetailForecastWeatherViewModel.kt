package com.example.weatherapp2.ui.detailforecastweatherfragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.weatherapp2.WeatherApp2
import com.example.weatherapp2.data.DataResult
import java.lang.Exception

class DetailForecastWeatherViewModel : ViewModel() {
    private var _dayId:String?=null
    val day = liveData {
        val  rezult = WeatherApp2.repository.getForecastWeather()
        if (_dayId !=null && rezult is DataResult.Success) {
            val day = rezult.data.forecast.values.toList().find {it.date == _dayId }
            if (day == null)
                throw Exception ("Can't find country with id =$_dayId")
            else
                emit(day)

        }
        else
            emit(null)
    }
    fun setDayId(id: String){
        _dayId = id
    }
}
