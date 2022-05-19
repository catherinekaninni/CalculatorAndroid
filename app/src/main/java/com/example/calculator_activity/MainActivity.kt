package com.example.calculator_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnminus: Button
    lateinit var btnmultiply: Button
    lateinit var btnmodulus: Button
    lateinit var etNumber1: EditText
    lateinit var  etNumber2: EditText
    lateinit var tvstatus:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd=findViewById(R.id.btnAdd)
        btnminus=findViewById(R.id.btnminus)
        btnmultiply=findViewById(R.id.btnmultiply)
        btnmodulus=findViewById(R.id.btnmodulus)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)
        tvstatus=findViewById(R.id.tvstatus)

        btnAdd.setOnClickListener {
            val Number1=etNumber1.text.toString()
            val Number2=etNumber2.text.toString()

            if (Number1.isBlank()){
                etNumber1.error="Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            addition(Number1.toInt(), Number2.toInt())
        }
        btnminus.setOnClickListener {
            val Number1=etNumber1.text.toString()
            val Number2=etNumber2.text.toString()
            if (Number1.isBlank()){
                etNumber1.error="Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            substraction(Number1.toInt(), Number2.toInt())

        }
        btnmultiply.setOnClickListener {
            val Number1=etNumber1.text.toString()
            val Number2=etNumber2.text.toString()
            if (Number1.isBlank()){
                etNumber1.error="Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            multiplication(Number1.toInt(), Number2.toInt())
        }
        btnmodulus.setOnClickListener {
            val Number1=etNumber1.text.toString()
            val Number2=etNumber2.text.toString()
            if (Number1.isBlank()){
                etNumber1.error="Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            modulus(Number1.toInt(), Number2.toInt())
        }


    }
    fun addition(Number1:Int , Number2:Int){
        val add=Number1+Number2
        tvstatus.text=add.toString()

    }
    fun substraction(Number1: Int ,Number2: Int){
        val minus=Number1-Number2
        tvstatus.text=minus.toString()
    }
    fun multiplication(Number1: Int ,Number2: Int){
        val multiply=Number1*Number2
        tvstatus.text=multiply.toString()
    }
    fun modulus(Number1: Int, Number2: Int){
        val modulus=Number1%Number2
        tvstatus.text=modulus.toString()
    }
}