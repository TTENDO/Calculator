package com.ttendo.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.calc_image)
        val firstNoEditText = findViewById<EditText>(R.id.first_No)
        val secondNoEditText = findViewById<EditText>(R.id.second_No)

        val sumButton = findViewById<Button>(R.id.add_button)
        val differenceButton : Button = findViewById(R.id.subtract_button)
        val productButton : Button = findViewById(R.id.multiply_button)
        val divisionButton : Button = findViewById(R.id.divide_button)

        val answerText : TextView = findViewById(R.id.display_answer)

        /**Implementing button click events**/
        sumButton.setOnClickListener{
            var firstNumber = firstNoEditText.text.toString().toInt()
            var secondNumber = secondNoEditText.text.toString().toInt()

            val theSum = firstNumber + secondNumber
            answerText.text = "The sum of $firstNumber and $secondNumber is $theSum"
        }

        differenceButton.setOnClickListener{
            var firstNumber = firstNoEditText.text.toString().toInt()
            var secondNumber = secondNoEditText.text.toString().toInt()

            val theDifference = firstNumber - secondNumber
            answerText.text = "The difference of $firstNumber and $secondNumber is $theDifference"
        }

        productButton.setOnClickListener{
            var firstNumber = firstNoEditText.text.toString().toInt()
            var secondNumber = secondNoEditText.text.toString().toInt()

            val theProduct = firstNumber * secondNumber
            answerText.text = "The product of $firstNumber and $secondNumber is $theProduct"
        }

        divisionButton.setOnClickListener{
            var firstNumber = firstNoEditText.text.toString().toInt()
            var secondNumber = secondNoEditText.text.toString().toInt()

            val division = firstNumber / secondNumber
            answerText.text = " $firstNumber divided by $secondNumber is $division"
        }

        answerText.setOnClickListener {
            val imageArray = arrayOf(R.drawable.off_white, R.drawable.grey_icon, R.drawable.calculator_icon,R.drawable.blue_icon)
            image.setImageResource(imageArray.random())
        }

    }
}