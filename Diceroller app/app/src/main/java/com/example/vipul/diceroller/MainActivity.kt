package com.example.vipul.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton:Button= findViewById(R.id.count_button)
        countButton.setOnClickListener { upcount() }
    }
    private fun rollDice(){
        /*Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()*/

        val randomInt = (1..6).random()
        val resultText: TextView= findViewById(R.id.result_text)
        /*resultText.text="Diced Rolled!"*/
        resultText.text = randomInt.toString()
    }

    fun IntRange.random(): Int{
        return Random().nextInt((endInclusive+1)- start)+ start
    }

    fun upcount(){

        val resultText: TextView= findViewById(R.id.result_text)
        if (resultText.text=="Hello World!"){
            resultText.text="1"
        }
        else {
            var temp = resultText.text.toString().toInt()
            if (temp < 6) {
                temp++
                resultText.text = temp.toString()
            }
        }
        }
}




