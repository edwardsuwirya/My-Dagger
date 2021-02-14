package com.enigmacamp.mydagger

import android.app.Application
import com.enigmacamp.mydagger.di.DaggerBioskopComponent

class BaseApplication : Application() {
    val appComponent = DaggerBioskopComponent.create()
}