package com.example.myfirstapp

import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        // Find button by ID
        val buttonShowMessage: Button = findViewById(R.id.button1)

        // Set click listener
        buttonShowMessage.setOnClickListener { // Show Toast message
            Toast.makeText(this@MainActivity, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
