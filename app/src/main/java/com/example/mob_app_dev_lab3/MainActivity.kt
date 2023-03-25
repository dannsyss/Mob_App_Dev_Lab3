package com.example.mob_app_dev_lab3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.mob_app_dev_lab3.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        binding.imageView.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.cat_1))
        val v:View= binding.root
        binding.imageButton.setOnClickListener{
            var rnd:Int=(1..3).random()
            var str:String="cat_"+rnd.toString()

            var resId:Int = getResources().getIdentifier(str, "drawable", getPackageName());

            binding.imageView.setImageDrawable(ContextCompat.getDrawable(this,resId))
        }

        setContentView(v)

    }
}