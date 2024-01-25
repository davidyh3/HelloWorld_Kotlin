package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button
        val btn = findViewById<Button>(R.id.sayHelloButton)

        // Set button behavior
        btn.setOnClickListener { v: View? -> updateText() }
    }

    private fun updateText() {

        // Write log about button click action
        Log.i("HelloWorldApp", "Button Clicked!")

        // Toast to let user know the button click action
        Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_SHORT).show()

        // Find the TextView
        val helloWorld = findViewById<TextView>(R.id.helloWorld)

        // Print "Hello World!"
        helloWorld.text = "Hello World!"
    }
}