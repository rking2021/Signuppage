package com.example.signuppage


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPage1 = findViewById<Button>(R.id.buttonPage1)
        val buttonPage2 = findViewById<Button>(R.id.buttonPage2)
        val buttonPage3 = findViewById<Button>(R.id.buttonPage3)

        buttonPage1.setOnClickListener {
            startActivity(Intent(this, Page1Activity::class.java))
        }

        buttonPage2.setOnClickListener {
            startActivity(Intent(this, Page2Activity::class.java))
        }

        buttonPage3.setOnClickListener {
            startActivity(Intent(this, Page3Activity::class.java))
        }
    }
}
