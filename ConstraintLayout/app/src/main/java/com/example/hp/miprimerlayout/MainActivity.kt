package com.example.hp.miprimerlayout

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.RippleDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.hp.miprimerlayout.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgResId = R.drawable.singapore
        var resId = imgResId

        upload.setOnClickListener{
            if (resId == R.drawable.singapore)
                resId = R.drawable.madidi
            else
                resId = R.drawable.singapore

            foto.setImageResource(resId)

        }
    }
}
