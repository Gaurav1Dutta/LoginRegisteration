package com.example.loginregisteration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class ForgotPassword : AppCompatActivity() {
    lateinit var  llForgetPass: LinearLayout
    lateinit var etEmailForgot : EditText
    lateinit var btnOtp: Button
    lateinit var login :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        llForgetPass =findViewById(R.id.llForgetPass)
        etEmailForgot= findViewById(R.id.etEmailForgot)
        btnOtp=findViewById(R.id.btnOtp)
        login = findViewById(R.id.login)


//        btnOtp.setOnClickListener {
//            val intent = Intent(this, PasswordChange::class.java)
//            intent.putExtra("email1", etEmailForgot.text.toString())
//            startActivity(intent)
//        }

        btnOtp.setOnClickListener {
            val email = etEmailForgot.text.toString()

            if (etEmailForgot.text.toString().isEmpty())
            {
                etEmailForgot.error = "Enter Your Email id"
            }
            else
            {
                val intent = Intent(this, OtpCheck::class.java)
                intent.putExtra("email1", email)
                startActivity(intent)
            }
        }

        login.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}