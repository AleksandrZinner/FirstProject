package com.example.materniy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.materniy.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.button.setOnClickListener {
        val materok = binding.button.text.toString()
        lifecycleScope.launch {
            gitHubService.materki(materok)

            binding.textMaterki.text = materok
        }
    }
    }


}
