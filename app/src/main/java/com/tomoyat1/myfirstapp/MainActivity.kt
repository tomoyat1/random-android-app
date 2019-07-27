package com.tomoyat1.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increment(view: View) {
        val textView = findViewById<TextView>(R.id.textView)
        var current = textView.text.toString().toInt()
        current += 1
        textView.text = current.toString()
    }
}

