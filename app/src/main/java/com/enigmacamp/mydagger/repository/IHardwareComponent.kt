package com.enigmacamp.mydagger.repository

interface IHardwareComponent {
    val tag: String
    fun getTagInfo(): String
}