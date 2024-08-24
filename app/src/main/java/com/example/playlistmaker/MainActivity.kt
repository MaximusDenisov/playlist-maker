package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = mapOf<String, Button>(
            Pair("SEARCH_BUTTON", findViewById(R.id.search_button)),
            Pair("MEDIA_BUTTON", findViewById(R.id.media_button)),
            Pair("SETTINGS_BUTTON", findViewById(R.id.settings_button))
        )

        // Реализация слушателей нажатия кнопки через лямбду-выражение.

        buttons["SEARCH_BUTTON"]?.setOnClickListener {
            val displayIntent = Intent(this, SearchActivity::class.java)
            startActivity(displayIntent)
        }
        buttons["MEDIA_BUTTON"]?.setOnClickListener {
            val displayIntent = Intent(this, MediaActivity::class.java)
            startActivity(displayIntent)
        }
        buttons["SETTINGS_BUTTON"]?.setOnClickListener {
            val displayIntent = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent)
        }
    }
}