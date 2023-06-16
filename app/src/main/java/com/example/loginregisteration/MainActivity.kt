package com.example.loginregisteration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var loginEmail: EditText
    lateinit var loginPassword: EditText
    lateinit var loginBtn: Button
    lateinit var registerUser : TextView
    lateinit var tvForgetPass : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginEmail = findViewById(R.id.loginEmail)
        loginPassword = findViewById(R.id.loginPassword)
        loginBtn = findViewById(R.id.loginBtn)
        registerUser =findViewById(R.id.registerUser)
        tvForgetPass =findViewById(R.id.tvForgotPass)

        registerUser.setOnClickListener {
            val intent =Intent(this, Registration::class.java)
            startActivity(intent)
        }
        tvForgetPass.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java )
            startActivity(intent)
        }

        loginBtn.setOnClickListener {
            if (loginEmail.text.toString().isEmpty()) {
                loginEmail.error = "Enter your email"
            } else if (loginPassword.text.toString().isEmpty()) {
                loginPassword.error = "enter_password"
            } else {
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Dummy::class.java)
                startActivity(intent)
                finish()
            }


            }
        }
    }
