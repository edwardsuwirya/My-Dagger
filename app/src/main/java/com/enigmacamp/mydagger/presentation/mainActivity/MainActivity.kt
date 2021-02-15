package com.enigmacamp.mydagger.presentation.mainActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.enigmacamp.mydagger.BaseApplication
import com.enigmacamp.mydagger.repository.Bioskop
import com.enigmacamp.mydagger.R
import com.enigmacamp.mydagger.databinding.ActivityMainBinding
import com.enigmacamp.mydagger.di.component.MainSubComponent
import com.enigmacamp.mydagger.presentation.secondActivity.SecondActivity
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import com.enigmacamp.mydagger.repository.IHardwareComponent
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mainSubComponent: MainSubComponent
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainSubComponent =
            (applicationContext as BaseApplication).appComponent.mainSubComponent().create()
        mainSubComponent.inject(this)

        binding.apply {
            saveButton.setOnClickListener {
                val filmText = filmEditText.text
                val layarText = layarEditText.text
                val proyektorText = proyektorEditText.text

                viewModel.setInfo(
                    layarText.toString(),
                    proyektorText.toString(),
                    filmText.toString()
                )
            }
            nextButton.setOnClickListener {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
        initViewModel()
        subscribe()
    }

    private fun initViewModel() {
        viewModel =
            ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
    }

    private fun subscribe() {
        viewModel.resultLiveData.observe(this, Observer {
            binding.infoTextView.text = it
        })
    }
}