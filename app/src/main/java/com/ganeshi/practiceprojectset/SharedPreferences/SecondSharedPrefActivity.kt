package com.ganeshi.practiceprojectset.SharedPreferences

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivitySecondSharedPrefBinding
import com.ganeshi.practiceprojectset.databinding.ActivitySharedPreferencesBinding

class SecondSharedPrefActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondSharedPrefBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondSharedPrefBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editor = getSharedPreferences("MySavePreference" , MODE_PRIVATE)
        binding.textViewData.setText("Your Name is = ${editor.getString("name" , null) }" +
        "Your address is = ${editor.getString("address" , null)}" +
        "Your password is = ${editor.getString("password" , null)}")

    }
}

//val sharedPreferences = getSharedPreferences("MySavePreference", Context.MODE_PRIVATE)
//val name = sharedPreferences.getString("name", null)
//val address = sharedPreferences.getString("address", null)
//val password = sharedPreferences.getString("password", null)
//
//binding.textViewData.text = "Your Name is = $name\n" +
//"Your address is = $address\n" +
//"Your password is = $password"
