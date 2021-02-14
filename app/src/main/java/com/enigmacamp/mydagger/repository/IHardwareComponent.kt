package com.enigmacamp.mydagger.repository

interface IHardwareComponent {
    var tag: String
    fun getTagInfo(): String
}