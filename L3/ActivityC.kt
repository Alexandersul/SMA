package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val b1: Button = findViewById(R.id.ActivityA)
        b1.setOnClickListener {
            val i = Intent(this@ActivityC, ActivityA::class.java)
            startActivity(i)
        }

        val b2: Button = findViewById(R.id.ActivityB)
        b2.setOnClickListener {
            val i = Intent(this@ActivityC, ActivityB::class.java)
            startActivity(i)
        }

        val b3: Button = findViewById(R.id.ActivityB)
        b3.setOnClickListener {
            val i = Intent(this@ActivityC, ActivityC::class.java)
            startActivity(i)
        }

    }
}