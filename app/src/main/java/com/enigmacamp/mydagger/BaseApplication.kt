package com.enigmacamp.mydagger

import android.app.Application
import com.enigmacamp.mydagger.di.ApplicationModule
import com.enigmacamp.mydagger.di.DaggerBioskopComponent

class BaseApplication : Application() {
    val appComponent = DaggerBioskopComponent.builder().applicationModule(ApplicationModule(this)).build()
}