package com.enigmacamp.mydagger.di.component

import com.enigmacamp.mydagger.presentation.mainActivity.MainActivity
import dagger.Subcomponent

@Subcomponent
interface MainSubComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainSubComponent
    }

    fun inject(activity: MainActivity)
}