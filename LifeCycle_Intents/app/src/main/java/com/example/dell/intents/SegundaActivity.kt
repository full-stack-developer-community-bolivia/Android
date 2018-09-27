package com.example.dell.intents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        setSupportActionBar(toolbar as Toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val y:String=intent.extras.getString("user")
        textViewDatos.text=y
        btnOk.setOnClickListener {
            Toast.makeText(this,"Este es un toast",
                    Toast.LENGTH_LONG).show()
        }
    }
}
