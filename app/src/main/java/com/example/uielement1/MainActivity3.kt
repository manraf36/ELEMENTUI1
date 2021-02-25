package com.example.uielement1

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.*
import java.util.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val pickBtn = findViewById<Button>(R.id.pickDateBtn)
        val dateTv1 = findViewById(R.id.dateTv) as TextView
        val shwinfo = findViewById<Button>(R.id.show_info)
        var bdy = findViewById(R.id.dateTv) as TextView
        val sw = findViewById(R.id.phone_sw) as Switch
        val pn= findViewById(R.id.phnnumber)as EditText
        pn.visibility = View.INVISIBLE
        sw.setOnClickListener{
            if (sw.isChecked == true){
                pn.visibility = View.VISIBLE

            }else{
                sw.isChecked == false
                pn.visibility = View.INVISIBLE
            }

        }




        pickBtn.setOnClickListener {
            val dpd = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view: DatePicker, mYear: Int, mMonth: Int, mDay: Int ->
                    dateTv1.setText("" + mDay + "/" + mMonth + "/" + mYear)
                },
                year,
                month,
                day
            )
            dpd.show()
        }
        shwinfo.setOnClickListener {
            var hbdy = bdy.text.toString()
            val fname = intent.getStringExtra("First Name")
            val lname = intent.getStringExtra("Last Name")
            val email = intent.getStringExtra("Email Address")
            val ages = intent.getStringExtra("Age")
            val pnumbr = pn.text.toString()
            /*val hbd = intent.getStringExtra("BirthDate")*/
            val intent = Intent(this@MainActivity3, MainActivity2::class.java)
            intent.putExtra("First Name", fname)
            intent.putExtra("Last Name", lname)
            intent.putExtra("Email Address", email)
            intent.putExtra("Age", ages)
            intent.putExtra("BirthDate", hbdy)
            intent.putExtra("Phone Number",pnumbr)
            startActivity(intent)
        }


    }


}

