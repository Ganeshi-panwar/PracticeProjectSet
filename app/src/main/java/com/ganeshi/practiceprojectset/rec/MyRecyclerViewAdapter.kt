package com.ganeshi.practiceprojectset.rec

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ganeshi.practiceprojectset.R
import org.w3c.dom.Text

class MyRecyclerViewAdapter(val context:Context , private val userDetails:ArrayList<MyUserData>):RecyclerView.Adapter<MyRecyclerViewAdapter.RecyclerViewHolder>(){
    class RecyclerViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val name1:TextView = view.findViewById(R.id.name)
        val profile:ImageView = view.findViewById(R.id.profile)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcitem , parent , false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userDetails.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
     //  val userDetail = userDetails[position]
        holder.profile.setImageResource(userDetails[position].profileImg)
        holder.name1.text = userDetails[position].name

    }

}