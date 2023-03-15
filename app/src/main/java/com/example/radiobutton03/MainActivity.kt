package com.example.radiobutton03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtResultado :TextView
    lateinit var  rdSuma : RadioButton
    lateinit var rdResta:RadioButton
    lateinit var rdDivision:RadioButton
    lateinit var rdMultiplicacion:RadioButton
    lateinit var num1:EditText
    lateinit var num2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // iniciando
        txtResultado= findViewById(R.id.tvResultado)
        rdSuma= findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        rdDivision=findViewById(R.id.rdDivision)
        rdMultiplicacion = findViewById(R.id.rdMultiplicacion)
        num1 = findViewById(R.id.ednum1)
        num2 = findViewById(R.id.ednum2)

    }
    fun accionButton(v:View){
        val numerito1 = num1.text.toString().toInt()
        val numerito2 = num2.text.toString().toInt()
        var resultado = 0
        if(rdSuma.isChecked){
            resultado = numerito1 + numerito2
        }else if (rdResta.isChecked){
            resultado = numerito1 -numerito2
        }else if(rdDivision.isChecked){
            resultado = numerito1/numerito2

        }else if(rdMultiplicacion.isChecked){
            resultado = numerito1*numerito2

        }
        txtResultado.text ="$resultado"

    }
}