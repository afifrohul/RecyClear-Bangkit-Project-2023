package com.example.recyclear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.recyclear.ui.home.HomeFragment
import com.example.recyclear.ui.home.HomeViewModel

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)
            finish()
        }, 7000)
    }
}