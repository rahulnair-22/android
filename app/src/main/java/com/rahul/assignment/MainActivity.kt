package com.rahul.assignment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val txtName = findViewById<EditText>(R.id.txtName)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val txtMob = findViewById<EditText>(R.id.txtMob)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            var name=txtName.text.toString()
            var mail=txtEmail.text.toString()
            var number=txtMob.text.toString()

            val intent = Intent(
                this@MainActivity,
                InfoActivity::class.java
            )
            intent.putExtra("name", name)
            intent.putExtra("mail", mail)
            intent.putExtra("number", number)
            startActivity(intent)

        }
    }
}