package com.example.weatherapp2.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp2.R
import com.example.weatherapp2.data.response.ForecastWeather
import kotlinx.android.synthetic.main.forecast_item.view.*

class ForecastWeatherListAdapter(val forecastWeatherList: List<ForecastWeather?>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = ForecastWeatherHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.forecast_item, parent, false)
        )
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
    var forecastWeather: ForecastWeather?=null
    set(value) {
        field = value
        itemView.datetextView.text = value?.date
        itemView.avgtemptextView.text = value?.avgtemp.toString()
    }
}