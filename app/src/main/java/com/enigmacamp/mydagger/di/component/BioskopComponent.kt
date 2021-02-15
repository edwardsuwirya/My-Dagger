package com.enigmacamp.mydagger.di.component

import com.enigmacamp.mydagger.di.module.ApplicationModule
import com.enigmacamp.mydagger.di.module.BioskopHardwareModule
import com.enigmacamp.mydagger.di.module.HardwareInfoModule
import com.enigmacamp.mydagger.di.module.SubComponentModule
import com.enigmacamp.mydagger.presentation.secondActivity.SecondActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, BioskopHardwareModule::class, HardwareInfoModule::class, SubComponentModule::class])
interface BioskopComponent {
    fun mainSubComponent(): MainSubComponent.Factory
    fun inject(activity: SecondActivity)
}