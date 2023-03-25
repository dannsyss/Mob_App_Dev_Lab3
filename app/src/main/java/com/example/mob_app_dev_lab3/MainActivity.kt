package com.example.mob_app_dev_lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mob_app_dev_lab3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button1.setOnClickListener{
            Toast.makeText(applicationContext,"Нажата кнопка 1.",Toast.LENGTH_SHORT).show()
            }

        binding.button2.setOnClickListener{
            Toast.makeText(applicationContext,"Нажата кнопка 2.",Toast.LENGTH_SHORT).show()
        }

        binding.button3.setOnClickListener{
            Toast.makeText(applicationContext,"Нажата кнопка 3.",Toast.LENGTH_SHORT).show()
        }

        binding.button4.setOnClickListener{
            Toast.makeText(applicationContext,"Нажата кнопка 4.",Toast.LENGTH_SHORT).show()
        }

        binding.button5.setOnClickListener{
            Toast.makeText(applicationContext,"Нажата кнопка 5.",Toast.LENGTH_SHORT).show()
        }

        binding.button6.setOnClickListener{
            Toast.makeText(applicationContext,"Нажата кнопка 6.",Toast.LENGTH_SHORT).show()
        }

        val view = binding.root
        setContentView(view)
        }
 }
