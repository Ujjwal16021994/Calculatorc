package com.example.calculatorc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnplus.setOnClickListener{
           val value1 = enter1.text.toString().toInt()
           val value2 = enter2.text.toString().toInt()
            output.text = (value1+value2).toString()
       }
        btnminus.setOnClickListener{
            val value1 = enter1.text.toString().toInt()
            val value2 = enter2.text.toString().toInt()
            output.text = (value1-value2).toString()
        }
        btnmultiply.setOnClickListener{
            val value1 = enter1.text.toString().toInt()
            val value2 = enter2.text.toString().toInt()
            output.text = (value1*value2).toString()
        }
        btndivide.setOnClickListener{
            val value1 = enter1.text.toString().toInt()
            val value2 = enter2.text.toString().toInt()
            if(value2==0){
                output.text = "cant divide by 0"
            }
            else if(value2<0)
            {
                output.text = "cant divide by a negative number"
            }
            else
            output.text = (value1/value2).toString()
        }
    }
}