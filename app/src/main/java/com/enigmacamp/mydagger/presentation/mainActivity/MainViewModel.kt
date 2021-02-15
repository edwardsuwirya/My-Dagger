package com.enigmacamp.mydagger.presentation.mainActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enigmacamp.mydagger.repository.Bioskop
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import javax.inject.Inject

class MainViewModel @Inject constructor(val bioskop: Bioskop, var sharedPref: BioskopSharedPref) :
    ViewModel() {
    private var _resultLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String>
        get() {
            return _resultLiveData
        }

    fun setInfo(layar: String, proyektor: String, film: String) {
        bioskop.film.tag = film
        bioskop.layar.tag = layar
        bioskop.proyektor.tag = proyektor

        val result = bioskop.tayang()
        _resultLiveData.value = result
        sharedPref.save("bioskop", result)
    }
}