package com.frag.weatherstatus.Date

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

class WeatherDate @Inject constructor() {
    private val TAG = "WEATHER_DATE"
    lateinit var date : String
    lateinit var weatherApiDateFormat : String
    init{
        val localDateTime = LocalDateTime.now()
        val format1 = DateTimeFormatter.ofPattern("dd MMMM,yyyy" , Locale.ENGLISH)
        val weatherDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd" , Locale.ENGLISH)
        val formatter = format1.format(localDateTime)
        val weatherDateFormatter = weatherDateFormat.format(localDateTime)

        formatter?.let {
            date = it
        }
        weatherDateFormatter.let {
            weatherApiDateFormat = it
        }
    }
}