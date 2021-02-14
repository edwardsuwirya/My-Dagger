package com.enigmacamp.mydagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    lateinit var info2TextView: TextView

    @Inject
    lateinit var bioskop: Bioskop
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        (applicationContext as BaseApplication).appComponent.inject(this)
        info2TextView = findViewById(R.id.info2_textView)
        Log.d("Activity2", bioskop.toString())
        info2TextView.setText("On Second Activity : ${bioskop.tayang()}")
    }
}