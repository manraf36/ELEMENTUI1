package com.example.uielement1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent = intent
        val fname = intent.getStringExtra("First Name")
        val lname = intent.getStringExtra("Last Name")
        val email = intent.getStringExtra("Email Address")
        val ages = intent.getStringExtra("Age")
        val hbdy = intent.getStringExtra("BirthDate")
        val pnumbr = intent.getStringExtra("Phone Number")

        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "First Name: " +fname+"\nLast Name:"+lname+"\nEmail:"+email+" \n Age:"+ages+"\nBirthDay:"+hbdy+"\nPhone No: "+pnumbr+"\n"


    }
}