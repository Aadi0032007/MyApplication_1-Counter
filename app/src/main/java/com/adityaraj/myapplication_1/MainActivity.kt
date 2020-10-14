package com.adityaraj.myapplication_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        x.text = "0"
    }
    fun addNum(v: View){
        val n = x.text.toString().toInt()
        val m =n+1
        x.text = m.toString()
    }
    fun subsNum(v: View){
        val a = x.text.toString().toInt()
        val b = a-1
        x.text = b.toString()
    }
    fun clr(v: View){
        x.text = "0"
    }

}