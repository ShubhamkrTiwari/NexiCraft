package com.example.nexicraft

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nexicraft.R.id
import com.example.nexicraft.R.id.aboutus

class CardView : AppCompatActivity() {
    private fun <T> findViewById(): ImageView? {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card_view)
        val aboutus = findViewById<ImageView>(aboutus)
        aboutus.setOnClickListener {
            val intent = Intent(this, aboutus::class.java)
            startActivity(intent)
        }

    }
}