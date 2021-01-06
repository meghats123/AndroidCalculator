package com.megha.androidcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mybtnclick(view: View) {
        intent= Intent(this,AdditionActivity::class.java);
        startActivity(intent);

    }

    fun mybuttonclick(view: View) {
        intent= Intent(this,SubtractionActivity::class.java);
        startActivity(intent);
    }

    fun myclick(view: View) {
        intent= Intent(this,MultiplicationActivity::class.java);
        startActivity(intent);
    }

    fun btnclick(view: View) {
        intent= Intent(this,DivisionActivity::class.java);
        startActivity(intent);
    }
}