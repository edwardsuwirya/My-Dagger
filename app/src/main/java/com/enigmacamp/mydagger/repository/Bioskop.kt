package com.enigmacamp.mydagger.repository

import javax.inject.Inject

class Bioskop @Inject constructor(
    val layar: IHardwareComponent,
    val proyektor: IHardwareComponent,
    val film: IHardwareComponent
) {
    fun tayang() =
        "Tayangan bioskop : ${layar.getTagInfo()}, ${proyektor.getTagInfo()}, ${film.getTagInfo()}"

}