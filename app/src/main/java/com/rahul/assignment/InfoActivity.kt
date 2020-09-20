package com.rahul.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val intent = intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("mail")
        val number = intent.getStringExtra("number")

        val resultName = findViewById<TextView>(R.id.resultName)
        val resultEmail=findViewById<TextView>(R.id.resultEmail)
        val resultMobile=findViewById<TextView>(R.id.resultNumber)
        resultName.text = name
        resultEmail.text=email
        resultMobile.text=number






    }
}