package com.bee.weatherapp.domain.repository

import com.bee.weatherapp.domain.util.Resource
import com.bee.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}