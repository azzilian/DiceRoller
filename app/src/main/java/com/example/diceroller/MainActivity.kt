package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollbutton)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resuktText: TextView = findViewById(R.id.resulttext)
        val randomInt = Random.nextInt(6) + 1
        resuktText.text = randomInt.toString()
    }
}