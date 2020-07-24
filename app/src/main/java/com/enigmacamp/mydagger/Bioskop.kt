package com.enigmacamp.mydagger

class Bioskop {
    var layar: Layar
    var proyektor: Proyektor
    var film: Film

    init {
        layar = Layar()
        proyektor = Proyektor()
        film = Film()
    }

    fun tayang() {
        println("Tayangan bioskop")
    }
}