package com.enigmacamp.mydagger.repository

import javax.inject.Inject

class Proyektor @Inject constructor() : IHardwareComponent {
    override val tag = "Proyektor"
    override fun getTagInfo(): String {
        return "setup ${tag}"
    }
}