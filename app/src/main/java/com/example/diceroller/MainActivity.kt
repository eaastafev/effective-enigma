package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        //val myDice = Dice(10)
        rollButton.setOnClickListener {
            rollDice()
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = myDice.roll().toString()
            //resultTextView.text = "6"
            //val toast = Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
    }
}

class Dice (private val numSides: Int){

    fun roll(): Int {
        return (1..numSides).random()
    }
}