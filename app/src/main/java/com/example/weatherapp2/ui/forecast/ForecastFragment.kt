package com.example.weatherapp2.ui.forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp2.R

class ForecastFragment : Fragment() {

    private lateinit var forecastViewModel: ForecastViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        forecastViewModel =
                ViewModelProvider(this).get(ForecastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_forecast, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        forecastViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}