package com.example.multiscreenapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY= "com.example.multiscreenapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t1=findViewById<EditText>(R.id.t1)
        val t2=findViewById<EditText>(R.id.t2)
        val t3=findViewById<EditText>(R.id.t3)
        val t4=findViewById<EditText>(R.id.t4)
        val order=findViewById<Button>(R.id.order)

        order.setOnClickListener(){
            val orders="Order Placed : " + t1.text.toString() + " , " + t2.text.toString() +
                    " , " + t3.text.toString() + " , " + t4.text.toString()

            val intent = Intent(this, Order::class.java)
            intent.putExtra(KEY,orders)
            startActivity(intent)
        }
    }
}