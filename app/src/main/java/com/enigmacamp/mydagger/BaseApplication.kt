package com.enigmacamp.mydagger

import android.app.Application
import com.enigmacamp.mydagger.di.component.DaggerBioskopComponent
import com.enigmacamp.mydagger.di.module.ApplicationModule

class BaseApplication : Application() {
    val appComponent = DaggerBioskopComponent.builder().applicationModule(ApplicationModule(this)).build()
}