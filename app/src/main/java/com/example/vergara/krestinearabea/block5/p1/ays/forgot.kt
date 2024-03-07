package com.example.vergara.krestinearabea.block5.p1.ays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class forgot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val redirectToLogin: TextView = findViewById(R.id.backtologinforgot)

        redirectToLogin.setOnClickListener {
            val intent = Intent(applicationContext, login::class.java)
            startActivity(intent)
        }
    }
}