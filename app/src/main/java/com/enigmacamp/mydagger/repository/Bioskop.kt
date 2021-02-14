package com.enigmacamp.mydagger.repository

import javax.inject.Inject

class Bioskop @Inject constructor(
    var layar: IHardwareComponent,
    var proyektor: IHardwareComponent,
    var film: IHardwareComponent
) {
    fun tayang() =
        "Tayangan bioskop : ${layar.getTagInfo()}, ${proyektor.getTagInfo()}, ${film.getTagInfo()}"

}