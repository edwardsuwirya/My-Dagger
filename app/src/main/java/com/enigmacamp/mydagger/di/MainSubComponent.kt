package com.enigmacamp.mydagger.di

import com.enigmacamp.mydagger.presentation.MainActivity
import dagger.Subcomponent

@Subcomponent
interface MainSubComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainSubComponent
    }

    fun inject(activity: MainActivity)
}