package com.example.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
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

        // Реализация слушателей нажатия кнопки через анонимный класс.
        // ¯ \ _ (ツ) _ / ¯

        // для кнопки Поиск
        val searchButtonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Вы нажали на кнопку 'Поиск'!", Toast.LENGTH_SHORT).show()
            }
        }
        buttons["SEARCH_BUTTON"]?.setOnClickListener(searchButtonClickListener)

//         для кнопки Медиатека
        val mediaButtonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Вы нажали на кнопку 'Медиатека'", Toast.LENGTH_SHORT).show()
            }
        }
        buttons["MEDIA_BUTTON"]?.setOnClickListener(mediaButtonClickListener)

//         для кнопки Настройки
        val settingsButtonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Вы нажали на кнопку 'Настройки'", Toast.LENGTH_SHORT).show()
            }
        }
        buttons["SETTINGS_BUTTON"]?.setOnClickListener(settingsButtonClickListener)


        // Реализация слушателей нажатия кнопки через лямбду-выражение.

        buttons["SEARCH_BUTTON"]?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Вы нажали на кнопку 'Поиск'!", Toast.LENGTH_SHORT).show()
        }
        buttons["MEDIA_BUTTON"]?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Вы нажали на кнопку 'Медиатека'!", Toast.LENGTH_SHORT).show()
        }
        buttons["SETTINGS_BUTTON"]?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Вы нажали на кнопку 'Настройки'!", Toast.LENGTH_SHORT).show()
        }
    }
}