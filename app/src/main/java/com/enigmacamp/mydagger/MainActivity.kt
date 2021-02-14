package com.enigmacamp.mydagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var infoTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bioskop = DaggerBioskopComponent.create().getBioskop()
        val result = bioskop.tayang()

        infoTextView = findViewById(R.id.info_textView)
        infoTextView.setText(result)

    }
}