package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * сделано по мануалу от Гугл
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val diceImage: ImageView = findViewById(R.id.imageView)
            val diceImage2: ImageView = findViewById(R.id.imageView2)
            rollDice()
        }
        //make a rollDice when the app starts
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(6)
        //calling class function
        val diceRoll = dice.roll()
        //find the imageView (dice in the center)
        val diceImage: ImageView = findViewById(R.id.imageView)
        //show the image based of diceRoll variable
        val drawableResource = when (diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        //update imageView and content description
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

        Toast.makeText(this, "Dice rolled!", Toast.LENGTH_SHORT).show()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}