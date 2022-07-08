package com.example.hrpcl_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class endactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_endactivity)

        val txt = findViewById<TextView>(R.id.value)
        val prefs = getSharedPreferences("SHARED_PREF_1", MODE_PRIVATE)
        val value = prefs.getInt("height",0)
        txt.setText(value.toString()+" Cm")




    }

    override fun onBackPressed() {
        super.onBackPressed()
        val myIntent = Intent(this@endactivity, MainActivity::class.java)
        myIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        this@endactivity.startActivity(myIntent)
    }
}