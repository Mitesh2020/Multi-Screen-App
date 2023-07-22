package com.example.multiscreenapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Order : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val order=findViewById<TextView>(R.id.orderList)
        val customerOrder=intent.getStringExtra(MainActivity.KEY)
        order.text=customerOrder.toString()
    }
}