package com.ganeshi.practiceprojectset.RecyclerView

import android.app.AlertDialog
import android.content.Context
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ganeshi.practiceprojectset.R

class recyclerViewAdapter(val context: Context , private val useDetails: ArrayList<MyUser>): RecyclerView.Adapter<recyclerViewAdapter.RecyclerViewHolder>() {
    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userProfile: ImageView = itemView.findViewById(R.id.profile)
        val userName: TextView = itemView.findViewById(R.id.name)
        val userAddress: TextView = itemView.findViewById(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleviewitem, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return useDetails.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentUser = useDetails[position]
        holder.userProfile.setImageResource(useDetails[position].profileImage)
        holder.userAddress.text = useDetails[position].userAddress
        holder.userName.text = useDetails[position].username


        // Set click listener
        holder.itemView.setOnClickListener {

            Toast.makeText(context, "Clicked: ${currentUser.profileImage}", Toast.LENGTH_SHORT).show()



        }
    }
}