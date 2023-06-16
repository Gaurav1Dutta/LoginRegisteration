package com.example.loginregisteration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class Registration : AppCompatActivity() {

    lateinit var regName : EditText
    lateinit var regEmail: EditText
    lateinit var regPassword: EditText
    lateinit var regPasswordCon: EditText
    lateinit var regPhone: EditText
    lateinit var btnRegister: Button
    lateinit var regLink : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        regName = findViewById(R.id.regName)
        regEmail = findViewById(R.id.regEmail)
        regPassword = findViewById(R.id.regPassword)
        regPasswordCon= findViewById(R.id.regPasswordCon)
        regPhone = findViewById(R.id.regPhone)
        btnRegister = findViewById(R.id.btnRegister)
        regLink = findViewById(R.id.regLink)

        val psw = regPassword
        btnRegister.setOnClickListener {
            if(regName.text.toString().isEmpty())
            {
                regName.error = "Enter Your Name"
            }
            else if(regEmail.text.toString().isEmpty()) {
                regEmail.error = "Enter Your Email id"
            }
            else if (regPassword.text.toString().isEmpty()) {
                regPassword.error = "Enter your Password"
            } else if (regPassword.text.toString().length < 6) {
                regPassword.error = "Password Length is Short"
            }
            else if(regPasswordCon.text.toString().isEmpty())
            {
                regPasswordCon.error = "Confirm Password"
            }
            else if (regPhone.text.toString().length < 10) {
                regPhone.error = "Phone Number Length is Short"
            } else if (regPhone.text.toString().isEmpty()) {
                regPhone.error = "Enter Your Mob. No."
            }
            else
                {
                    val Psw = regPassword.text.toString()
                    val confirm = regPasswordCon.text.toString()
                    if(Psw.equals(confirm))
                    {
                        Toast.makeText(this, "Register Successfully", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    else {
                        regPasswordCon.error = "Confirm Password"
                    }
            }

                }
        regLink.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }

            }
        }