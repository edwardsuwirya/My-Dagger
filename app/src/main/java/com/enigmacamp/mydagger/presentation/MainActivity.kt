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
import com.enigmacamp.mydagger.repository.IHardwareComponent
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    lateinit var infoTextView: TextView
    lateinit var nextButton: Button

    @Inject
    lateinit var bioskop: Bioskop

    @Inject
    lateinit var newFilm: IHardwareComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (applicationContext as BaseApplication).appComponent.inject(this)
        newFilm.tag = "Spiderman"
        bioskop.film = newFilm
        val result = bioskop.tayang()
        Log.d("Activity1", bioskop.toString())
        infoTextView = findViewById(R.id.info_textView)
        infoTextView.setText(result)

        nextButton = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}