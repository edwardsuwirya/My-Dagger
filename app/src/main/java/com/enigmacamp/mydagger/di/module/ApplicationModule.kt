package com.enigmacamp.mydagger.di.module

import android.content.Context
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val applicationContext: Context) {
    @Singleton
    @Provides
    fun provideApplicationContext() = applicationContext

    @Singleton
    @Provides
    fun provideSharedPref(context: Context) = BioskopSharedPref(context)
}