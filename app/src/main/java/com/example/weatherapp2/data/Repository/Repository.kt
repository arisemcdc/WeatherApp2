package com.example.weatherapp2.data.Repository

import com.example.weatherapp2.data.DataResult
import com.example.weatherapp2.data.WeatherApi
import com.example.weatherapp2.data.response.Current
import com.example.weatherapp2.data.response.CurrentWeatherResponse
import com.example.weatherapp2.data.response.Day
import com.example.weatherapp2.data.response.ForecastWeather
import java.lang.Exception

/*class Repository (val localDB: RoomDB){
    suspend fun getCurrentWeather(): DataResult<CurrentWeatherResponse> {
        val result = try {
            val data = WeatherApi.retrofitService.getCurrentWeather()
            localDB.currentWeatherDAO().insert(data)
            DataResult.Success(data)
        } catch (e: Exception) {
            val localData=localDB.currentWeatherDAO().getCurrent()
            if (localData.isNotEmpty())
                DataResult.Success(localData[0])
            else
                DataResult.Error(e)
        }
        return result
    }
    suspend fun getForecastWeather() = WeatherApi.retrofitService.getForecastWeather()
}*/
class Repository () {
    suspend fun getCurrentWeather():DataResult<CurrentWeatherResponse>{
        val rezult = try {
            DataResult.Success(WeatherApi.retrofitService.getCurrentWeather())
        } catch (e : Exception) {
            DataResult.Error(e)
        }
        return rezult
    }
    /*suspend fun getForecastWeather() = WeatherApi.retrofitService.getForecastWeather()*/
    suspend fun getForecastWeather(): DataResult<ForecastWeather> {
        val rezult = try {
            //val data = WeatherApi.retrofitService.getForecastWeather().forecast.values.toList()
           /* localDB.forecastDAO().insert(data)*/
            DataResult.Success(WeatherApi.retrofitService.getForecastWeather())
        } catch (e:Exception) {
            /*val localData = localDB.forecastDAO().getForecast()
            if (localData.isNotEmpty())
                DataResult.Success(localData)
            else*/
                DataResult.Error(e)
        }
        return rezult
    }
}