package com.example.findmyage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bufindage.setOnClickListener {
            val birth: Int = enter.text.toString().toInt()
            //val currentyear:Int= Calendar.getInstance().get(Calender.YEAR)
            val age = 2019 - birth
             result.text=age.toString()
        }


        }

    }



