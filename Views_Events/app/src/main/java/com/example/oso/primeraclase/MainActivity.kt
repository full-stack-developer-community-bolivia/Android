package com.example.oso.primeraclase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cambiarTexto.setOnClickListener {
            textoSaludo.text = getString(R.string.ejemplo_de_texto)
        }

        limpiarTexto.setOnClickListener {
            textoSaludo.text = ""
        }
    }
}
