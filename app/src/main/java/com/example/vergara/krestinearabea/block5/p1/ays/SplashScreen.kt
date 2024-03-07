package com.example.vergara.krestinearabea.block5.p1.ays

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val mainIntent = Intent(this@SplashScreen, login::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DELAY)
    }
}
