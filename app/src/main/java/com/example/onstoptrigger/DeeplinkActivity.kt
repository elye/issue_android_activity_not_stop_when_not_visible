package com.example.onstoptrigger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DeeplinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}