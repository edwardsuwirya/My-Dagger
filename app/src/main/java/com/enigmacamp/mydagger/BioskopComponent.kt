package com.enigmacamp.mydagger

import dagger.Component

@Component
interface BioskopComponent {
    fun getBioskop(): Bioskop
}