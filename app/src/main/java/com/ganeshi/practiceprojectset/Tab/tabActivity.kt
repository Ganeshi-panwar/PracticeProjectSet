package com.ganeshi.practiceprojectset.Tab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.ganeshi.practiceprojectset.R
import com.google.android.material.tabs.TabLayout

class tabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)


       val viewPager:ViewPager = findViewById(R.id.view_pager)
        val tabLayout:TabLayout = findViewById(R.id.tab_layout)
        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(CodeFragment() , "Code")
        fragmentAdapter.addFragment(GeeksFragment() , "Geek")
        fragmentAdapter.addFragment(LeetFragment() , "Leek")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}