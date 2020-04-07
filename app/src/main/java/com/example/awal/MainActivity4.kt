package com.example.awal

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.coba4.*

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coba4)


     val nama = intent.getStringExtra(EXTRA_MESSAGE)
        tV6.setText(
            "Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat " +
                    "bantu kamu ngatur waktu :)"
        )


    }
}