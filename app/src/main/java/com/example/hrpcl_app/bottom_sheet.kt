package com.example.hrpcl_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class bottom_sheet(context: Context) : BottomSheetDialog(context) {


    init {
        setContentView(R.layout.bottom_next)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val okau = findViewById<Button>(R.id.ok);
        okau?.setOnClickListener {
            val myIntent = Intent(context, endactivity::class.java)
            context.startActivity(myIntent)
        }

    }



}