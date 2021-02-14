package com.enigmacamp.mydagger.di

import com.enigmacamp.mydagger.repository.*
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class BioskopHardwareModule {

    @Singleton
    @Provides
    fun provideBioskop(
        @Named("Layar") layar: IHardwareComponent,
        @Named("Proyektor") proyektor: IHardwareComponent,
        @Named("Film") film: IHardwareComponent
    ): Bioskop =
        Bioskop(layar, proyektor, film)
}