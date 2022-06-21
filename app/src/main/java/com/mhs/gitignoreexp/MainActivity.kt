package com.mhs.gitignoreexp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mhs.gitignoreexp.cart.CartActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvCart).setOnClickListener {
            startActivity(Intent(this,CartActivity::class.java))
        }
    }
}