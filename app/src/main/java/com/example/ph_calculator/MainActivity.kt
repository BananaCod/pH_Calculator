package com.example.ph_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ph_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if(binding.etNumber.text.isNotEmpty()) {
                binding.tv3.text = ""
                var value = binding.etNumber.text.toString().toDouble()
                binding.etNumber.text.clear()
                var result = -1 * Math.log10(value)
                binding.tv3.text = result.toString()
            }
        }
    }
}