package com.example.stringanalyser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewResults : TextView = findViewById(R.id.viewResults)
        val sampleString : EditText = findViewById(R.id.sampleString)
        val reverseBtn : Button = findViewById(R.id.reverseBtn)
        val countBtn : Button = findViewById(R.id.countBtn)

        reverseBtn.setOnClickListener {
            val sampleText = sampleString.editableText
            val reverseWord = sampleText.reversed()
            viewResults.text = "The reversed word is $reverseWord."
        }

        countBtn.setOnClickListener {
            val lengthOfString = sampleString.length()
            viewResults.text = "There are $lengthOfString letters in the string."
        }
    }
}