package com.ratih.dzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        tv_pagi.setOnClickListener(this)
        tv_sore.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.tv_pagi -> {
                val intenMove = Intent (this, PagiActivity::class.java)
                startActivity(intenMove)
            }
            R.id.tv_sore -> {
                val intenMove2 = Intent (this, SoreActivity::class.java)
                startActivity(intenMove2)
            }
        }
    }
}