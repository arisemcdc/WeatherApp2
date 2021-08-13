package com.example.weatherapp2.ui.today_weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp2.R

class TodayWeatherFragment : Fragment() {

    private lateinit var todayWeatherViewModel: TodayWeatherViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        todayWeatherViewModel =
                ViewModelProvider(this).get(TodayWeatherViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_today_weather, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        todayWeatherViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}