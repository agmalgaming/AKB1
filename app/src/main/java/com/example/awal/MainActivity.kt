package com.example.awal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Tanggal Pengerjaan 6/4/2020
        //NIM : 10117189
        //Nama : Agung Maulana
        //Kelas : IF-5

        val btnOpenActivity2 : Button = findViewById(R.id.button3)
        btnOpenActivity2.setOnClickListener {

            val intent = Intent(this, MainActivity2 :: class.java)
            startActivity(intent)
        }


            }
        }






