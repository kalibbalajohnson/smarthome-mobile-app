package com.example.mysmarthome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun next1(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

}