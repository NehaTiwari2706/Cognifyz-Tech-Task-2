package com.example.task2

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstbutton = findViewById<Button>(R.id.firstbutton)

        firstbutton.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
