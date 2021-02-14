package com.enigmacamp.mydagger.repository

import javax.inject.Inject

class Film @Inject constructor() : IHardwareComponent {
    override val tag = "Film"
    override fun getTagInfo(): String {
        return "menayangkan ${tag}"
    }
}