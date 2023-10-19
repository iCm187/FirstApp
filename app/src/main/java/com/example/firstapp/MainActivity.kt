package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewItems()
    }

    private fun setViewItems() {
        findViewById<AppCompatButton>(R.id.login_bt).setOnClickListener{
            val intent = Intent( this, HelloActivity::class.java)
            val userLogin = findViewById<AppCompatEditText>(R.id.code).text.toString()
            intent.putExtra("login", userLogin)
            startActivity(intent)
        }
    }
}