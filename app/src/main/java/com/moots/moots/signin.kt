package com.moots.moots

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.google.firebase.auth.FirebaseAuth
import android.content.Intent
import android.widget.Button


class signin : AppCompatActivity() {
    // Mendeklarasikan variabel auth di tingkat kelas
//    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin)

        val bt_gotohome = findViewById<Button>(R.id.bt_gotohome)
        bt_gotohome.setOnClickListener{
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        // Initialize Firebase Auth di dalam onCreate

    }

}
