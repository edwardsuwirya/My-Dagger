package com.enigmacamp.mydagger

import javax.inject.Inject

class Bioskop @Inject constructor(val layar: Layar, val proyektor: Proyektor, val film: Film) {
    fun tayang() = "Tayangan bioskop dengan ${layar.tag}, ${proyektor.tag}, ${film.tag}"

}