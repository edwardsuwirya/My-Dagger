package com.enigmacamp.mydagger.presentation.secondActivity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import javax.inject.Inject

class SecondActivityViewModelFactory @Inject constructor(
    val sharedPref: BioskopSharedPref
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SecondViewModel(sharedPref) as T
    }
}