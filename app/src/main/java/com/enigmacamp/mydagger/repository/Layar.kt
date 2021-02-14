package com.enigmacamp.mydagger.repository

import javax.inject.Inject

class Layar @Inject constructor() : IHardwareComponent {
    override var tag = "Layar"
    override fun getTagInfo(): String {
        return "menggunakan ${tag}"
    }
}