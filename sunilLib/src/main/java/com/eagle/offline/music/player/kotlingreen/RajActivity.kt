package com.eagle.offline.music.player.kotlingreen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RajActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raj)

        val ss:String = intent.getStringExtra("Username").toString()
        val tv = findViewById<TextView>(R.id.txt)
        tv.text = ss

    }
}


object kumar{
    val sunil = "sunil"
}