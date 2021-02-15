package com.enigmacamp.mydagger.presentation.secondActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.enigmacamp.mydagger.BaseApplication
import com.enigmacamp.mydagger.repository.Bioskop
import com.enigmacamp.mydagger.R
import com.enigmacamp.mydagger.databinding.ActivitySecondBinding
import com.enigmacamp.mydagger.presentation.mainActivity.MainViewModel
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    lateinit var viewModel: SecondViewModel

    @Inject
    lateinit var viewModelFactory: SecondActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (applicationContext as BaseApplication).appComponent.inject(this)
        initViewModel()
        subscribe()
        viewModel.getInfoFromPref()
    }

    private fun initViewModel() {
        viewModel =
            ViewModelProvider(this, viewModelFactory).get(SecondViewModel::class.java)
    }

    private fun subscribe() {
        viewModel.infoLiveData.observe(this, Observer {
            binding.info2TextView.text = it
        })
    }
}