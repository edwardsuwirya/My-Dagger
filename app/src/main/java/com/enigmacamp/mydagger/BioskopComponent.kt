package com.enigmacamp.mydagger

import dagger.Component

@Component
interface BioskopComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}