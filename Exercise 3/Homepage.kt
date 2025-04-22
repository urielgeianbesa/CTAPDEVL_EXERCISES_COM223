package com.example.exercise2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exercise_2.R

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Get the username from the Intent
        val username = intent.getStringExtra("USER_NAME")

        // Display the username in the TextView with id 'User_name'
        val userNameTextView = findViewById<TextView>(R.id.User_name)
        userNameTextView.text = username ?: "Guest"  // Display "Guest" if no username is provided
    }
}
