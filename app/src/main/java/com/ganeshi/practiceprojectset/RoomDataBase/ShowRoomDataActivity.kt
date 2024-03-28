package com.ganeshi.practiceprojectset.RoomDataBase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityShowRoomDataBinding

class ShowRoomDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowRoomDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowRoomDataBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db = DBHandler.getDB(this)
        binding.showData.text = db.userDao.getAll().toString()

    }
}