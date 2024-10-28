package com.example.turkcellnestedscrollviewlab

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    fun alertEkle(view: View) {
        var eklemeUyari = AlertDialog.Builder(this)
        eklemeUyari.setTitle("Uyarı")
        eklemeUyari.setMessage("Ürünü Eklemek İstiyor Musunuz?")

        eklemeUyari.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Ürün Eklendi!",Toast.LENGTH_SHORT).show()
        })

        eklemeUyari.setNegativeButton("Hayır",null)

        var uyari = eklemeUyari.create()
        uyari.show()
    }
}