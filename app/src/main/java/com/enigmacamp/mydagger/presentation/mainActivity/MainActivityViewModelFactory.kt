package com.enigmacamp.mydagger.presentation.mainActivity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.enigmacamp.mydagger.di.scope.ActivityScope
import com.enigmacamp.mydagger.repository.Bioskop
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import javax.inject.Inject


@ActivityScope
class MainActivityViewModelFactory @Inject constructor(
    val sharedPref: BioskopSharedPref,
    val bioskop: Bioskop
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(bioskop, sharedPref) as T
    }
}