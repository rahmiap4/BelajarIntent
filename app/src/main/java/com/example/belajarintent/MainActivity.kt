package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    private lateinit var btnpdata: Button
    private lateinit var btnpobjek: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent =findViewById(R.id.btn_intent)
        btnpdata=findViewById(R.id.btn_pindah_data)
        btnpobjek=findViewById(R.id.btn_pindah_objek)

        btnIntent.setOnClickListener(this)
        btnpdata.setOnClickListener(this)
        btnpobjek.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent-> run{
                val intentBiasa = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data-> run{
                val intentData = Intent(this@MainActivity, PindahDataActivity::class.java)
                intentData.putExtra(PindahDataActivity.EXTRA_TEXT, "halo saya ami")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek->run{
                val cars = Cars(
                "Honda Civic",
                2020,
                "BM 2121 RAI",
                )
                val intentobjek = Intent(this@MainActivity, PindahObjekActivity::class.java)
                intentobjek.putExtra(PindahObjekActivity.EXTRA_CARS,cars)
                startActivity(intentobjek)
            }
        }
    }
}