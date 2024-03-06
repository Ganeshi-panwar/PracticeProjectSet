package com.ganeshi.practiceprojectset.FrameLayout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_frame_layout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text1 = findViewById<TextView>(R.id.txt1)
        val text2 = findViewById<TextView>(R.id.tet2)
        val text3 = findViewById<TextView>(R.id.txt3)

        val switchButton = findViewById<Button>(R.id.switched)

    switchButton.setOnClickListener {
        if (text1.visibility == View.VISIBLE) {
            text1.visibility == View.GONE
            text2.visibility = View.VISIBLE
        }else{
            text1.visibility = View.VISIBLE
        }
//        }else if(text2.visibility == View.VISIBLE){
//            text2.visibility == View.GONE
//            text3.visibility == View.VISIBLE
//        }
//        else if (text3.visibility == View.VISIBLE){
//            text3.visibility = View.GONE
//            text1.visibility = View.VISIBLE
//
//
//        }
    }

    }
}