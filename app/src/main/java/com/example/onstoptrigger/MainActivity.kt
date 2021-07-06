package com.example.onstoptrigger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Track", "MainActivity: onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Track", "MainActivity: onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Track", "MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Track", "MainActivity: onPause")
    }

    fun startNextActivity(view: View) {
        startActivity(Intent(this, NextActivity::class.java))
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        startActivity(Intent(this, NextActivity::class.java))
    }
}
