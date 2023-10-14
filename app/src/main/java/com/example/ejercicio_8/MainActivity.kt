package com.example.ejercicio_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView =  findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editTextText)
        button.setOnClickListener {
            val userInput = editText.text.toString()
            textView.text = "Texto ingresado: $userInput"
        }
    }
}