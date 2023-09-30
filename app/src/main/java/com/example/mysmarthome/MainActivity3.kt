package com.example.mysmarthome

import android.graphics.Typeface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*
import com.example.mysmarthome.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val selectedTime = intent.getStringExtra("selected_time")
        val textView45 = findViewById<TextView>(R.id.textView45)
        val textView35 = findViewById<TextView>(R.id.textView35)
        val textView52 = findViewById<TextView>(R.id.textView52)
        val  textView55 = findViewById<TextView>(R.id. textView55)

        if (selectedTime != null) {
            textView45.text = "The time is $selectedTime"
            textView45.setTypeface(null, Typeface.BOLD)
            textView55.visibility = View.VISIBLE
            textView35.visibility = View.VISIBLE
            textView52.visibility = View.VISIBLE
        }

        val selectedValue = intent.getStringExtra("input_value")
        val textView48 = findViewById<TextView>(R.id.textView48)
        if (selectedValue != null) {
            textView48.text = "Send Notification: $selectedValue"
        }

    }
    fun next3(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
    fun next4(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
}