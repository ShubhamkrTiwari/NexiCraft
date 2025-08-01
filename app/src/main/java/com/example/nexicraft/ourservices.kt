package com.example.nexicraft

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ourservices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ourservices)
        val appdevbtn: Button = findViewById(R.id.appdevbtn)
        appdevbtn.setOnClickListener {
            val intent = Intent(this, appdetails::class.java)
            startActivity(intent)
        }
    }
}