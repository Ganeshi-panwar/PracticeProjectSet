package com.ganeshi.practiceprojectset.RecyclerView

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerViewBinding
    var listTheCategories = arrayListOf<MyUser>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listTheCategories = ArrayList<MyUser>()
        listTheCategories.add(MyUser(R.drawable.a , "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.b, "Shefali" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.c , "Anita" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.dd, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.e , "Mushkan" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.gg, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.b, "Shefali" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.c , "Anita" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.d, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.o, "Mushkan" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.jj, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.m, "Shefali" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.c , "Anita" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.j, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.e , "Mushkan" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.b, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.d, "Shefali" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.c , "Anita" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.e, "Ganeshi" ,"Prem nagar dehradun" ))
        listTheCategories.add(MyUser(R.drawable.w, "Mushkan" ,"Prem nagar dehradun" ))

        binding.recyclerView.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)
        binding.recyclerView.adapter = recyclerViewAdapter(this, listTheCategories)

    }
}