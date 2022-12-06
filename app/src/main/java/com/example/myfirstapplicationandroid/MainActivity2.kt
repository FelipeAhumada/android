package com.example.myfirstapplicationandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val _fullname = findViewById<TextView>(R.id.tvFullName)

        val bundle = intent.extras
        val _name = bundle?.getString("_name")
        val _lastname = bundle?.getString("_lastname")

        _fullname.text = _name.toString() + " " + _lastname.toString()

    }
}