package com.example.dell.intents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_intents_implicitos.*

class IntentsImplicitosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents_implicitos)

        /*val sexo:String
        var edad:Int*/
        irMaps.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_VIEW)
            val uri: Uri = Uri.parse("geo:-1254884,458785")
            intent.data = uri
            startActivity(intent)
        }

        irGmail.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_SENDTO)
            intent.type = "text/plain"
            val uri: Uri = Uri.parse("mailto:")
            intent.data = uri

//            PARA DESTINATARIO
            intent.putExtra(Intent.EXTRA_EMAIL,
                    arrayOf("cristian@gmail.com", "david@gmail.com"))

//            PARA ASUNTO
            intent.putExtra(Intent.EXTRA_SUBJECT, "Aqui viene el asunto")

//            PARA EL CONTENIDO
            intent.putExtra(Intent.EXTRA_TEXT, "Aqui va el contenido")

            startActivity(intent)
        }

        irTexto.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            val msg = "Hola te comparto esta cadena"
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            startActivity(intent)
        }

        aumentar.setOnClickListener {
            var c = contador.text.toString().toInt()
            c++
            contador.text = c.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }


    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }


    //    RECUPERAR DATOS AL GIRAR LA PANTALLA
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("onRestoreInstanceState","entra aqui")
        if (savedInstanceState != null) {
            contador.text = savedInstanceState.getInt("numero").toString()
        }
    }

//    GUARDAR DATOS
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.e("onSaveInstanceState","${contador.text}")
        outState?.putInt("numero",contador.text.toString().toInt())
    }

}
