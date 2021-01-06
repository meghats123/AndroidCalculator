package com.megha.androidcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AdditionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)
    }

    fun addclick(view: View) {
        var getNum1=findViewById<EditText>(R.id.num1);
        var getNum2=findViewById<EditText>(R.id.num2);
        var num1=getNum1.text.toString();
        var num2=getNum2.text.toString();
        var result:Double=num1.toDouble()+num2.toDouble();
        Toast.makeText(this,result.toString(),Toast.LENGTH_LONG).show();



    }

    fun bclick(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}