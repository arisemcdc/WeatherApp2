package com.example.weatherapp2.Adapters

import android.net.sip.SipSession
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp2.R
import com.example.weatherapp2.data.response.Day
import com.example.weatherapp2.data.response.ForecastWeatherMock
import kotlinx.android.synthetic.main.forecast_item.view.*

class ForecastWeatherListAdapter(val forecastWeatherList: List<Day>, val listener: Listener): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    interface Listener {
        fun onClickDay(day: Day)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = ForecastWeatherHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.forecast_item, parent, false)
        )
        viewHolder.itemView.setOnClickListener {
          if (viewHolder.forecastWeather != null)
               listener.onClickDay(viewHolder.forecastWeather!!)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ForecastWeatherHolder)
            holder.forecastWeather = forecastWeatherList[position]
    }

    override fun getItemCount(): Int {
        return forecastWeatherList.size
    }
}
class ForecastWeatherHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var forecastWeather: Day?=null
    set(value) {
        field = value
        itemView.datetextView.text = value?.date
        itemView.avgtemptextView.text = value?.avgtemp.toString()
    }
}
