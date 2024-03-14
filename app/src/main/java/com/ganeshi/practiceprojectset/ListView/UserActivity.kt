package com.ganeshi.practiceprojectset.ListView

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding:ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        val phone = intent.getStringExtra("phone")
        val imgId = intent.getIntExtra("imgId", R.drawable.a)


        binding.name.text = name
        binding.county.text = country
        binding.phone.text = phone
        binding.profileImage.setImageResource(imgId)

        }
    }
