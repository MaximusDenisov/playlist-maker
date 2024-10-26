package com.example.playlistmaker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val toolbar = findViewById<MaterialToolbar>(R.id.settings_toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener { finish() }

        val shareAppButton = findViewById<TextView>(R.id.shareAppButton)
        shareAppButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.setType("text/plain")
            shareIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.url_course))
            startActivity(Intent.createChooser(shareIntent, getString(R.string.choose_app_for_share)))
        }

        val writeToSupportButton = findViewById<TextView>(R.id.writeToSupportButton)
        writeToSupportButton.setOnClickListener {
            val writeIntent = Intent(Intent.ACTION_SENDTO)
            writeIntent.data = Uri.parse("mailto:")
            writeIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(getString(R.string.dev_mail)))
            writeIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.title_mail_for_dev))
            writeIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.text_mail_for_dev))
            startActivity(writeIntent)
        }
//        https://yandex.ru/legal/practicum_offer/

        val userAgreementButton = findViewById<TextView>(R.id.userAgreementButton)
        userAgreementButton.setOnClickListener {
            val userAgreementIntent = Intent(Intent.ACTION_VIEW)
            userAgreementIntent.data = Uri.parse(getString(R.string.url_user_agree))
            startActivity(userAgreementIntent)
        }
    }
}