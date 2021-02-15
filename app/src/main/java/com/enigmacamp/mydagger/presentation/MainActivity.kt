package com.enigmacamp.mydagger.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.enigmacamp.mydagger.BaseApplication
import com.enigmacamp.mydagger.repository.Bioskop
import com.enigmacamp.mydagger.R
import com.enigmacamp.mydagger.di.MainSubComponent
import com.enigmacamp.mydagger.repository.BioskopSharedPref
import com.enigmacamp.mydagger.repository.IHardwareComponent
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    lateinit var infoTextView: TextView
    lateinit var nextButton: Button

    @Inject
    lateinit var bioskop: Bioskop

    @Inject
    @field:Named("Film")
    lateinit var newFilm: IHardwareComponent
    lateinit var mainSubComponent: MainSubComponent

    @Inject
    lateinit var sharedPref: BioskopSharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainSubComponent =
            (applicationContext as BaseApplication).appComponent.mainSubComponent().create()
        mainSubComponent.inject(this)
        sharedPref.save("film", "Spiderman")
        newFilm.tag = "Spiderman"
        bioskop.film = newFilm
        val result = bioskop.tayang()
        Log.d("Activity1", sharedPref.toString())
        infoTextView = findViewById(R.id.info_textView)
        infoTextView.setText(result)

        nextButton = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}