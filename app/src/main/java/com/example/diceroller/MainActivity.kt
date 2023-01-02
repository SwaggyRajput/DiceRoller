package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // lateinit var rollImg: ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //         val rollImg: ImageView=findViewById(R.id.roll_img)
        val rollButton: Button = findViewById(R.id.roll_button)
       // rollButton.text = "Let's Roll"


        rollButton.setOnClickListener{
          //  Toast.makeText(this,"nhi ho rha kya",Toast.LENGTH_SHORT).show()
            RollDice()
        }


    }

    private fun RollDice() {
       //  val rollText: TextView=findViewById(R.id.roll_textview)
        val rollImg: ImageView=findViewById(R.id.roll_img)
        //  rollText.text="2"
        val randomInt= Random.nextInt(6)+1
        // rollText.text=randomInt.toString()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        rollImg.setImageResource(drawableResource)

    }
}