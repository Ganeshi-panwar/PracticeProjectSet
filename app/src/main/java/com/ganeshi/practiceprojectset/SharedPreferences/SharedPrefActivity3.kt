package com.ganeshi.practiceprojectset.SharedPreferences

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivitySharedPref3Binding
import java.lang.reflect.Modifier

class SharedPrefActivity3 : AppCompatActivity() {
    private lateinit var binding:ActivitySharedPref3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPref3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val editor = getPreferences(MODE_PRIVATE)
        binding.checkBox.isChecked = editor.getBoolean("checked", false)
        binding.editTextTextEmailAddress.setText(editor.getString("email" , null))

        binding.save.setOnClickListener {
            val editor = getPreferences(MODE_PRIVATE).edit()
            editor.putString("email", binding.editTextTextEmailAddress.text.toString())
            editor.putBoolean("checked" , binding.checkBox.isChecked)
            editor.apply()
        }

    }
}