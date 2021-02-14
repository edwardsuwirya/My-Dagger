package com.enigmacamp.mydagger.repository

import javax.inject.Inject

class Film @Inject constructor() : IHardwareComponent {
    override var tag = "Film"
    override fun getTagInfo(): String {
        return "menayangkan ${tag}"
    }
}