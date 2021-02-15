package com.enigmacamp.mydagger.di.module

import com.enigmacamp.mydagger.repository.Film
import com.enigmacamp.mydagger.repository.IHardwareComponent
import com.enigmacamp.mydagger.repository.Layar
import com.enigmacamp.mydagger.repository.Proyektor
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class HardwareInfoModule {
    @Binds
    @Named("Layar")
    abstract fun bindLayar(layar: Layar): IHardwareComponent

    @Binds
    @Named("Proyektor")
    abstract fun bindProyekor(proyektor: Proyektor): IHardwareComponent

    @Binds
    @Named("Film")
    abstract fun bindFilm(film: Film): IHardwareComponent
}