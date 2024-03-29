package com.example.mypractical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val resultText: TextView = findViewById(R.id.result_text)

    }
        private fun rollDice() {
            Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()
            val randomInt = Random().nextInt(6) + 1
            result_text.text = randomInt.toString()
        }
    }

