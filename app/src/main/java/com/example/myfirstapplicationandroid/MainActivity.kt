package com.example.myfirstapplicationandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val _name = findViewById<EditText>(R.id.name)
        val _lastname = findViewById<EditText>(R.id.lastname)
        val btn = findViewById<Button>(R.id.btnEnviar)
        btn.setOnClickListener{
            val _intent = Intent(this, MainActivity2::class.java)
            _intent.putExtra("name", _name.text.toString())
            _intent.putExtra("lastname", _lastname.text.toString())
            startActivity(_intent)
        }
    }
}