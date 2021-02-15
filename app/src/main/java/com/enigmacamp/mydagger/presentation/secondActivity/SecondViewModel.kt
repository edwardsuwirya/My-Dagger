package com.enigmacamp.mydagger.presentation.secondActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import javax.inject.Inject

class SecondViewModel @Inject constructor(var sharedPref: BioskopSharedPref) : ViewModel() {
    private var _infoLiveData = MutableLiveData<String>()
    val infoLiveData: LiveData<String>
        get() {
            return _infoLiveData
        }

    fun getInfoFromPref() {
        val infoPref = sharedPref.getValueString("bioskop")
        _infoLiveData.value = infoPref
    }
}