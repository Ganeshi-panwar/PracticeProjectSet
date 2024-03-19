package com.ganeshi.practiceprojectset.Dialogs

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityDialogsMainBinding
import com.ganeshi.practiceprojectset.databinding.ActivityRecyclerViewDemoBinding



class DialogsMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDialogsMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogsMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.clickMe.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this@DialogsMainActivity)
            alertDialogBuilder.setMessage("Are you sure you want to exit?")
            alertDialogBuilder.setTitle("Message Box")
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.setPositiveButton("yes"){_,_ ->
                finish()
            }
            alertDialogBuilder.setNegativeButton("No"){_,_ ->
                Toast.makeText(this@DialogsMainActivity , "Clicked No" , Toast.LENGTH_SHORT).show()
            }

            alertDialogBuilder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(this@DialogsMainActivity , "Clicked Cancel" , Toast.LENGTH_SHORT).show()
            }
            val alertDialogBox = alertDialogBuilder.create()
            alertDialogBox.show()



        }
    }
}

