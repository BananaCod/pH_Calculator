package com.example.ph_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ph_calculator.databinding.ActivityMainBinding
import kotlin.math.log10
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if(binding.etNumber.text.isNotEmpty() and binding.et2.text.isNotEmpty()) {
                binding.tv3.text = ""
                var power : Int = binding.et2.text.toString().toInt()
                var ten : Float = 10F
                var value = binding.etNumber.text.toString().toDouble() * (ten.pow(power))
                binding.etNumber.text.clear()
                var result = -1 * log10(value)
                binding.tv3.text = result.toString()
            }
        }
    }
}