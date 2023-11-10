package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun onCheckboxClicked(view: View) {

        val checkBox: CheckBox = findViewById(R.id.checkBox3)
        val checkBox2: CheckBox = findViewById(R.id.checkBox4)
        val checkBox3: CheckBox = findViewById(R.id.checkBox5)
        val img: ImageView=findViewById(R.id.imageView)
if (checkBox.isChecked){
    img.setImageResource(R.drawable.apple)
}
        if(checkBox2.isChecked){
            img.setImageResource(R.drawable.pear)
        }
        if (checkBox3.isChecked){
            img.setImageResource(R.drawable.grape)
        }
    }

    fun onRadioButtonClicked(view: View) {
        val img: ImageView=findViewById(R.id.imageView)

        val rb1: RadioButton=findViewById(R.id.radioButton)
        val rb2: RadioButton=findViewById(R.id.radioButton3)
        val rb3: RadioButton=findViewById(R.id.radioButton4)
        if (rb1.isChecked){
            img.setImageResource(R.drawable.apple)
        }
       if (rb2.isChecked){
           img.setImageResource(R.drawable.pear)
       }
        if (rb3.isChecked){
            img.setImageResource(R.drawable.grape)
        }
    }
}