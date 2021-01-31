package com.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * 自定义application用于获取context
 */
class SunnyWeatherApplication:Application() {

    /**
     * 伴生对象，获取context
     */
    companion object{
        const val TOKEN = "5WFrtsjTpaGrqrxx"
        lateinit var context: Context

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}