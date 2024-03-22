package com.ganeshi.practiceprojectset.SharedPreferences

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivitySharedPreferencesBinding

class SharedPreferencesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySharedPreferencesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPreferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val editor = getSharedPreferences("MySavePreference" , MODE_PRIVATE)
        binding.password1.setText(editor.getString("password" , null))
        binding.user1.setText(editor.getString("name" , null))
        binding.address1.setText(editor.getString("address" , null))
        binding.imageView2.setOnClickListener{
            startActivity(Intent(this, SharedPrefActivity3::class.java))
        }

        binding.LogIn.setOnClickListener {
            val sharedPreferences = getSharedPreferences("MySavePreference", MODE_PRIVATE).edit()
            sharedPreferences.putString("name" , binding.user1.text.toString())
            sharedPreferences.putString("address" , binding.address1.text.toString())
            sharedPreferences.putString("password" , binding.password1.text.toString())
            sharedPreferences.apply()
            startActivity(Intent(this, SecondSharedPrefActivity::class.java))
        }
    }
}