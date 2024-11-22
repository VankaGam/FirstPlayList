package com.example.playlistmaker

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayButton1 = findViewById<LinearLayout>(R.id.setting)
        val displayButton2 = findViewById<LinearLayout>(R.id.poisk)
        val displayButton3 = findViewById<LinearLayout>(R.id.media)

        displayButton1.setOnClickListener {
            val displayIntent1 = Intent(this, SettingActivity::class.java)
            startActivity(displayIntent1)
        }
        displayButton2.setOnClickListener {
            val displayIntent2 = Intent(this, SearchActivity::class.java)
            startActivity(displayIntent2)
        }
        displayButton3.setOnClickListener {
            val displayIntent3 = Intent(this, MediaLibraryActivity::class.java)
            startActivity(displayIntent3)
        }

    }
}
