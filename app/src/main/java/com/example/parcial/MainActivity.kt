package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.String.Companion as String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton1 = findViewById<Button>(R.id.mybutton)
        val myEditText1 = findViewById<EditText>(R.id.myeditText1)
        val myEditText2 = findViewById<EditText>(R.id.myeditText2)
        val myTextView = findViewById<TextView>(R.id.mytextView3)

        myButton1.setOnClickListener {

            if(TextUtils.isEmpty(myEditText1.text) || TextUtils.isEmpty(myEditText2.text)){
                myTextView.text = "El Usuario y la Contraseña son obligatorios"
                myTextView.setVisibility(View.VISIBLE)
            }
            if( (myEditText1.text.toString() == "oslern.garciam@ecci.edu.co") ||
                (myEditText1.text.toString() == "rafael.pereiraa@ecci.edu.co") ||
                (myEditText1.text.toString() == "cesare.canabaln@ecci.edu.co") ||
                (myEditText1.text.toString() == "diegoa.amadorg@ecci.edu.co") ){
                if ((myEditText2.length() >= 4)){
                    val intent = Intent(this, WelcomeActivity::class.java)
                    startActivity(intent)
                }else{
                    myTextView.text = "la Contraseña debe tener al menos 4 digitos"
                    myTextView.setVisibility(View.VISIBLE)
                }
            }else{
                myTextView.text = "El usuairo es incorrecto"
                myTextView.setVisibility(View.VISIBLE)
            }
            return@setOnClickListener
        }
    }
}