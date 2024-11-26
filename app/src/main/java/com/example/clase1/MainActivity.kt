package com.example.clase1

import android.os.Bundle
import android.text.method.Touch
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var entrada : EditText
    private lateinit var btnCalcular : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        entrada= findViewById(R.id.entrada)
        btnCalcular =  findViewById(R.id.calcular)
        btnCalcular.setOnClickListener {
            val edad = entrada.text.toString().toInt()

            comprobarEdad(edad)
        }
    }

    private fun comprobarEdad(edad:Int) {
        if(edad>=18){
            Toast.makeText(this, "Eres mayor de edad", Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this, "No eres mayor de edad", Toast.LENGTH_SHORT).show()
        }

    }
}