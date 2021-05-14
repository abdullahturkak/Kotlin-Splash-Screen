package com.abdullahturkak.kotlin_splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Handler
import java.util.logging.Handler.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.os.Handler().postDelayed({
            intent= Intent(applicationContext,HomeActivity::class.java)
            startActivity(intent)
        },3000)
    }
}