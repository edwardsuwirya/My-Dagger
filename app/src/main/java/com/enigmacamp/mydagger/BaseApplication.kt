package com.enigmacamp.mydagger

import android.app.Application

class BaseApplication : Application() {
    val appComponent = DaggerBioskopComponent.create()
}