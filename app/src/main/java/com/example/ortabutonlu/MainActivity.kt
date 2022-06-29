package com.example.ortabutonlu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.ortabutonlu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNavMenu.background = null

        navController = findNavController(R.id.fragmentContainerView)
        setupWithNavController(binding.bottomNavMenu,navController)

        binding.floatbutton.setOnClickListener {
            Toast.makeText(it!!.context, "Added in basket", Toast.LENGTH_SHORT).show()
        }
    }
}