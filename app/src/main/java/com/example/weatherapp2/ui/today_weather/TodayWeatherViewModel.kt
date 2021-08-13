package com.example.weatherapp2.ui.today_weather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodayWeatherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is today weather Fragment"
    }
    val text: LiveData<String> = _text
}