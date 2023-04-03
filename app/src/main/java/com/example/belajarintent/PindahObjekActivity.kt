package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahObjekActivity : AppCompatActivity() {
    private lateinit var tvpenerimaobjek : TextView

    companion object{
        const val EXTRA_CARS = "extra_cars"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek3)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        tvpenerimaobjek=findViewById(R.id.tv_penerima_objek)

        val cars: Cars = intent.getParcelableExtra<Cars>(EXTRA_CARS) as Cars
        val text = "merk: ${cars.merk.toString()} \nTahun: ${cars.tahun.toString()}\nPlat: ${cars.plat.toString()}"
        tvpenerimaobjek.text = text
    }
}