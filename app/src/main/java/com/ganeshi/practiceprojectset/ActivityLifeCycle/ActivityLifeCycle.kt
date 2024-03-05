package com.ganeshi.practiceprojectset.ActivityLifeCycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R

class ActivityLifeCycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        Log.d("LifeCycle" , "onCreate invoked")
    }

    override fun onStart() {
        super.onStart()

        Log.d("LifeCycle" , "onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle" , "onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle" , "onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle" , "onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle" , "onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle" , "onDestroy invoked")
    }
}