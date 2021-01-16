package com.ratih.dzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

            //kode buat atur waktu displashscreen
            Handler().postDelayed({
                startActivity(Intent(this, CategoryActivity::class.java) )
                finish()
            }, 5000)
    }
}