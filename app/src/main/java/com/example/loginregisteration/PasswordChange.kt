package com.example.loginregisteration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class PasswordChange : AppCompatActivity() {
    lateinit var email1: TextView
    lateinit var newpassword :EditText
    lateinit var conpass : EditText
    lateinit var changeBtn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_change)
        email1 =findViewById(R.id.email1)
        newpassword= findViewById(R.id.newpassword)
        conpass = findViewById(R.id.conPass)
        changeBtn = findViewById(R.id.changeBtn)

        intent?.let {
            val email = intent.getStringExtra("email")
            email1.text = "$email"
        }

        changeBtn.setOnClickListener {
            if(newpassword.text.toString().isEmpty())
            {
                newpassword.error = "Enter Password"
            }
            else if(conpass.text.toString().isEmpty())
            {
                conpass.error = "Confirm Password"
            }
            else{
                val Password = newpassword.text.toString()
                val Confirm = conpass.text.toString()
                if (Password.equals(Confirm)) {
                    Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    conpass.error = "Confirm Password"
                }
            }
        }
    }
}