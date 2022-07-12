package com.example.prac1

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var diceImg: ImageView
    lateinit var numberText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImg = findViewById(R.id.diceImg)
        numberText=findViewById(R.id.numberText)
        val button: Button = findViewById(R.id.rollButton)
        button.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomNum = (1..6).random()
        //val numberText: TextView = findViewById(R.id.numberText)
       // val diceImg: ImageView = findViewById(R.id.diceImg)
        numberText.text = randomNum.toString()
        val imgSrc = when (randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImg.setImageResource(imgSrc)
        Toast.makeText(this, randomNum.toString(), Toast.LENGTH_SHORT).show()
    }
}