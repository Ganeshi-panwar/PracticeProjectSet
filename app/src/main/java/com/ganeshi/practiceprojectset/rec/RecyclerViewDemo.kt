package com.ganeshi.practiceprojectset.rec

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityRecyclerViewDemoBinding

class RecyclerViewDemo : AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerViewDemoBinding
    private var userArray = arrayListOf<MyUserData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userArray = ArrayList()
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        userArray.add(MyUserData("Ganeshi Panwar" , R.drawable.a))
        binding.recyclerView2.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)


    }
}