package  com.moots.moots

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        val bt_signup = findViewById<Button>(R.id.bt_signup)
        bt_signup.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val bt_signin = findViewById<Button>(R.id.bt_signin)
        bt_signin.setOnClickListener{
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }


    }
}