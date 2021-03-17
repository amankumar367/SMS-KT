package com.sms.kt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.sms.kt.R
import com.sms.kt.ui.sms.SMSActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            SMSActivity.start(this)
        }, SPLASH_TIMEOUT)

    }

    companion object {
        private const val SPLASH_TIMEOUT = 2000L // 2 seconds.
    }
}