package com.charles.compoundinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.security.Principal
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//var inputOne : EditText = findViewById(R.id.input1)
        var p: EditText = findViewById(R.id.principal)
        var r: EditText = findViewById(R.id.Interest_rate)
        var Calculate: Button = findViewById(R.id.calculate)
        var t: EditText = findViewById(R.id.time)
        var A: TextView = findViewById(R.id.Amount)
        /*var n: RadioButton =  findViewById(R.id.monthlyradio) or findViewById(R.id.annualradio)
        if (n == findViewById(R.id.monthlyradio)) {
            var n = 12
        } else if (n == findViewById(R.id.annualradio)) {
            var n = 1
        }*/
        Calculate.setOnClickListener{

            //var firstText = inputOne.text.toString().trim()
            var Pstr = p.text.toString().trim()
            var rstr =r.text.toString().trim()
            var tstr = t.text.toString().trim()
            var n= 12
            if (Pstr.isEmpty() || rstr.isEmpty() || tstr.isEmpty())
                Toast.makeText(applicationContext,"please enter a value in each parameter",Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            var Pint = Pstr.toDouble()
            var rint = rstr.toDouble()
            var tint = tstr.toDouble()

            //calculation
            var Amount =  Pint*(1 + rint/n ).pow(n*tint)
            A.text ="$Amount"




        }
    }
    }