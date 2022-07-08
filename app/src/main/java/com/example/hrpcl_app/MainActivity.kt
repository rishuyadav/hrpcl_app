package com.example.hrpcl_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.hrpcl_app.databinding.ActivityMainBinding
import com.kevalpatel2106.rulerpicker.RulerValuePickerListener


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rulerPicker.setValuePickerListener(object : RulerValuePickerListener {
            override fun onValueChange(value: Int) {
                val editor = getSharedPreferences(
                    "SHARED_PREF_1", MODE_PRIVATE
                ).edit()
                editor.putInt("height", value);
                editor.commit();
            }

            override fun onIntermediateValueChange(selectedValue: Int) {
                binding.currentCM.setText("$selectedValue")
            }
        })
        binding.next.setOnClickListener {
            val bottom_sheet = bottom_sheet(this)
            bottom_sheet.show()
        }
        binding.backButton.setOnClickListener{
            finish()
        }
    }
}