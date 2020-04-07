package com.example.awal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coba2)

        val btnOpenActivity3 : Button = findViewById(R.id.button6)
        btnOpenActivity3.setOnClickListener {

            val intent = Intent(this, MainActivity3 :: class.java)
            startActivity(intent)
        }




    }
}