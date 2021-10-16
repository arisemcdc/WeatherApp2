package com.example.weatherapp2.ui.forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp2.Adapters.ForecastWeatherListAdapter
import com.example.weatherapp2.R
import com.example.weatherapp2.data.response.Day
import com.example.weatherapp2.data.response.ForecastWeatherMock
import kotlinx.android.synthetic.main.fragment_forecast.*
import kotlinx.android.synthetic.main.fragment_forecast.view.*

class ForecastFragment : Fragment(), ForecastWeatherListAdapter.Listener {
    //lateinit var root: View
    private lateinit var forecastViewModel: ForecastViewModel
   lateinit var forecastWeatherListAdapter: ForecastWeatherListAdapter
    //Test mock forecastWeather
    /*val forecastWeatherList = arrayListOf<ForecastWeatherMock>()
    val forecastWeather1 = ForecastWeatherMock("12.11.2021", 10)
    val forecastWeather2 = ForecastWeatherMock("13.11.2021", 9)
    val forecastWeather3 = ForecastWeatherMock("14.11.2021", 10)
    val forecastWeather4 = ForecastWeatherMock("15.11.2021", 11)
    val forecastWeather5 = ForecastWeatherMock("16.11.2021", 9)
    val forecastWeather6 = ForecastWeatherMock("17.11.2021", 8)
    val forecastWeather7 = ForecastWeatherMock("18.11.2021", 10)*/

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        forecastViewModel =
                ViewModelProvider(this).get(ForecastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_forecast, container, false)
/*val textView: TextView = root.findViewById(R.id.text_dashboard)
        forecastViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

        /*fillExampleForecastWeatherList()*/
        root.forecastWeatherListRecyclerView.layoutManager =LinearLayoutManager(context)
        forecastViewModel.dates.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                forecastWeatherListAdapter = ForecastWeatherListAdapter(it,this)
                forecastWeatherListRecyclerView.adapter = forecastWeatherListAdapter
                forecastWeatherListRecyclerView.visibility=View.VISIBLE
                errorTextView.visibility = View.GONE
            }
            else {
                forecastWeatherListRecyclerView.visibility=View.GONE
                errorTextView.visibility = View.VISIBLE
                errorTextView.text ="Error!"
            }
            })
        forecastViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            if (it == true)
                root.progressBarForecastWeather.visibility = View.VISIBLE
            else
                root.progressBarForecastWeather.visibility = View.GONE
        })
        /*forecastWeatherListAdapter = ForecastWeatherListAdapter(forecastWeatherList!!)
        root.forecastWeatherListRecyclerView.adapter = forecastWeatherListAdapter*/
        return root
    }

    override fun onClickDay(day: Day) {
        val action = ForecastFragmentDirections.actionForecastFragmentToDetailForecastWeatherFragment(day.date)
        findNavController().navigate(action)
    }
    /*fun fillExampleForecastWeatherList(){
        forecastWeatherList.add(forecastWeather1)
        forecastWeatherList.add(forecastWeather2)
        forecastWeatherList.add(forecastWeather3)
        forecastWeatherList.add(forecastWeather4)
        forecastWeatherList.add(forecastWeather5)
        forecastWeatherList.add(forecastWeather6)
        forecastWeatherList.add(forecastWeather7)
    }*/
}
