package com.enigmacamp.mydagger.di

import com.enigmacamp.mydagger.presentation.MainActivity
import com.enigmacamp.mydagger.presentation.SecondActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BioskopHardwareModule::class, HardwareInfoModule::class])
interface BioskopComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}