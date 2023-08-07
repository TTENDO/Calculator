package com.ttendo.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.ttendo.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = binding.calcImage
        val firstNoEditText = binding.firstNo
        val secondNoEditText = binding.secondNo

        val sumButton = binding.addButton
        val differenceButton = binding.subtractButton
        val productButton = binding.multiplyButton
        val divisionButton = binding.divideButton

        val answerText = binding.displayAnswer

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