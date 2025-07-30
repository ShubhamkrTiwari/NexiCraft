package com.example.nexicraft

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.nexicraft.R.*

class CardView : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_card_view)
        val aboutbutton: Button = findViewById(R.id.aboutbutton)
        aboutbutton.setOnClickListener {
            val intent = Intent(this, aboutus::class.java)
            startActivity(intent)
        }

    }
}
