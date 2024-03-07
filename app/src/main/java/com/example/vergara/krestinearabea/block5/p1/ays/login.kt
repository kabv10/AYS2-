package com.example.vergara.krestinearabea.block5.p1.ays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnlogin: Button = findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        val button: TextView = findViewById(R.id.create)
        val forgotpassword: TextView = findViewById(R.id.forgotPassword)

        button.setOnClickListener {
            val intent = Intent(applicationContext, signup::class.java)
            startActivity(intent)
        }

        forgotpassword.setOnClickListener {
            val intent = Intent(applicationContext, forgot::class.java)
            startActivity(intent)
        }

    }
}