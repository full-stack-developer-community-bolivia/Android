package com.example.dell.intents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val intent:Intent=Intent(this,SegundaActivity::class.java)
            var dato:String=editTextUsuario.text.toString()
            intent.putExtra("user",dato)
            startActivity(intent)
        }
        textViewRegistro.setOnClickListener {
            val uri:Uri=Uri.parse("https://www.google.com/")
            val i:Intent= Intent(Intent.ACTION_VIEW,uri)
            startActivity(i)

        }
    }
}
