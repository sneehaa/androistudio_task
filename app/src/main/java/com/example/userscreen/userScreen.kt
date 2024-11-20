package com.example.userscreen

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class userScreen : AppCompatActivity() {

    lateinit var fName: TextInputLayout
    lateinit var lName: TextInputLayout
    lateinit var email: TextInputLayout
    lateinit var password: TextInputLayout
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        fName = findViewById(R.id.firstName)
        lName = findViewById(R.id.lastName)
        email = findViewById(R.id.EmailField)
        password= findViewById(R.id.PasswordField)
        button = findViewById(R.id.signUpButton)

        setContentView(R.layout.activity_user_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}