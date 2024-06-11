package com.moots.moots

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Navbar
        val bt_home = findViewById<Button>(R.id.bt_home)
        bt_home.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val bt_search = findViewById<Button>(R.id.bt_search)
        bt_search.setOnClickListener{
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
        val bt_up = findViewById<Button>(R.id.bt_up)
        bt_up.setOnClickListener{
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
        val bt_like = findViewById<Button>(R.id.bt_like)
        bt_like.setOnClickListener{
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
        val bt_profile = findViewById<Button>(R.id.bt_profile)
        bt_profile.setOnClickListener{
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}