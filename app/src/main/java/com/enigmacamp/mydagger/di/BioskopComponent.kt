package com.enigmacamp.mydagger.di

import android.content.Context
import com.enigmacamp.mydagger.presentation.MainActivity
import com.enigmacamp.mydagger.presentation.SecondActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, BioskopHardwareModule::class, HardwareInfoModule::class, SubComponentModule::class])
interface BioskopComponent {
    fun mainSubComponent(): MainSubComponent.Factory
    fun inject(activity: SecondActivity)
}