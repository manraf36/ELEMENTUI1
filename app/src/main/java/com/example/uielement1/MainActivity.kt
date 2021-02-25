package com.example.uielement1

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var slider:SeekBar
        var ages= findViewById(R.id.resultTv1)as TextView
        val firstname = findViewById<EditText>(R.id.firstname)
        val lastname = findViewById<EditText>(R.id.lastname)
        val email = findViewById<EditText>(R.id.email)
        val proced = findViewById<Button>(R.id.proceed)
        slider = findViewById(R.id.seekBar2)as SeekBar
        slider.setProgress(18)
        slider.max = 60
        slider.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, p2: Boolean) {
                ages.text= progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        proced.setOnClickListener {
            val fname = firstname.text.toString()
            val lname = lastname.text.toString()
            val emailet = email.text.toString()
            val  taon= ages.text.toString()
            /* val hbd = bdy.text.toString()
 */


            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            intent.putExtra("First Name", fname)
            intent.putExtra("Last Name", lname)
            intent.putExtra("Email Address", emailet)
            intent.putExtra("Age",taon)
            /*  intent.putExtra("BirthDate",hbd)*/

            startActivity(intent)


        }

    }


}