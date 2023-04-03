package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_TEXT = "extra_text"
    }
    private lateinit var tvpenerima : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data3)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        tvpenerima=findViewById(R.id.tv_pindahdata)
        val tvReceived=intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang dikirim : $tvReceived"

        tvpenerima.text=text
    }
}