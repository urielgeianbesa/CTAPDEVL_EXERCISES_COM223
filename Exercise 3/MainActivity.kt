package com.example.exercise2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercise_2.R

class MainActivity : AppCompatActivity() {

    // Hardcoded login credentials
    private val validUsername = "admin"
    private val validPassword = "admin123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            val inputUsername = usernameEditText.text.toString().trim()
            val inputPassword = passwordEditText.text.toString().trim()

            if (inputUsername == validUsername && inputPassword == validPassword) {
                // Login success, pass the username to the Homepage
                val intent = Intent(this, Homepage::class.java)
                intent.putExtra("USER_NAME", inputUsername)  // Send username to Homepage
                startActivity(intent)
            } else {
                // Login failed
                Toast.makeText(this, "The password is wrong, please try again", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
