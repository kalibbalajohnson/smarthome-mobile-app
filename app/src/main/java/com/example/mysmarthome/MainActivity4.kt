package com.example.mysmarthome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import java.util.*
import android.widget.TextView
import android.app.TimePickerDialog

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val textView36 = findViewById<TextView>(R.id.textView36)
        textView36.setOnClickListener {
            time(textView36)
        }

    }
    fun time(view: View) {
        val currentTime = Calendar.getInstance()
        val hour = currentTime.get(Calendar.HOUR_OF_DAY)
        val minute = currentTime.get(Calendar.MINUTE)

        val timePicker = TimePickerDialog(view.context, { _, hourOfDay, minute ->
            // Do something with the selected time (e.g. update the TextView)
            val timeString = String.format("%02d:%02d", hourOfDay, minute)
            //(view as TextView).text = "The time is $timeString"
            val intent = Intent(this, MainActivity3::class.java)

            // Add the selected time as an extra to the Intent
            intent.putExtra("selected_time", timeString)

            // Launch the new activity
            startActivity(intent)
        }, hour, minute, true)

        timePicker.show()
    }

}