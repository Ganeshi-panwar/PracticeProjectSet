package com.ganeshi.practiceprojectset.ListView

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ganeshi.practiceprojectset.R
import com.ganeshi.practiceprojectset.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding
    private lateinit var userArrayList: ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgId = intArrayOf(
            R.drawable.a,
            R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.dd, R.drawable.e, R.drawable.g,
            R.drawable.gg, R.drawable.ggg, R.drawable.h, R.drawable.j,
            R.drawable.jj, R.drawable.k, R.drawable.m, R.drawable.n,
            R.drawable.o, R.drawable.p, R.drawable.r, R.drawable.rr,
            R.drawable.u, R.drawable.uu, R.drawable.w

        )
        val name = arrayOf("Elizabeth", "Emily", "Olivia", "Amelia", "Charlotte",
            "Ava", "Isabella", "Jennifer", " Sophia", "Barbara",
            "Chloé", "Dorothy", "Elena", "Evelyn", "Harper",
            "Mia", "Emily", "Olivia", "Amelia", "Charlotte"

        )
        val lastMessage = arrayOf("Elizabeth", "Emily", "Olivia", "Amelia", "Charlotte",
            "Ava", "Isabella", "Jennifer", " Sophia", "Barbara",
            "Chloé", "Dorothy", "Elena", "Evelyn", "Harper",
            "Mia", "Emily", "Olivia", "Amelia","Amelia" )

        val lastMsgTime = arrayOf(
            "10:30 pm", "11:02 am", "12:50 am", "01:02 pm", "02:02 am",
            "11:30 pm", "01:02 am", "12:00 am", "01:03 pm", "02:08 am",
            "03:30 pm", "11:12 am", "12:40 am", "01:05 pm", "02:06 am",
            "12:30 pm", "11:22 am", "12:20 am", "01:06 pm", "02:04 am"
        )

        val phoneNumber = arrayOf(
            "(716) 216-4940",
            "(308) 384-1033",
            "(530) 474-4674",
            "(903) 427-3117",
            "(864) 595-7222",
            "(706) 547-7437",
            "(716) 216-4940",
            "(308) 384-1033",
            "(530) 474-4674",
            "(903) 427-3117",
            "(864) 595-7222",
            "(706) 547-7437",
            "(716) 216-4940",
            "(308) 384-1033",
            "(530) 474-4674",
            "(903) 427-3117",
            "(864) 595-7222",
            "(706) 547-7437",
            "(716) 216-4940",
            "(308) 384-1033"
        )

        val country = arrayOf(
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola",
            "Argentina", "Armenia", "Bahamas ", "Bahrain", "Andorra",
            "Argentina", "Armenia", "Bahamas", "Bahrain", "Australia",
            "Azerbaijan", "Bangladesh", "Belarus", "Belize", "Belgium",
        )

        userArrayList = ArrayList()
        for (i in name.indices) {
            val user = User(name[i],country[i],phoneNumber[i],lastMsgTime[i] , lastMessage[i] , imgId[i])
            userArrayList.add(user)
        }
        binding.listView.isClickable = true

        binding.listView.adapter = MyAdapter(this , userArrayList)
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val name = name[position]
            val phone = phoneNumber[position]
            val country = country[position]
            val imaId = imgId[position]

            val i = Intent(this , UserActivity::class.java )
            i.putExtra("name", name)
            i.putExtra("phone", phone)
            i.putExtra("country" , country)
            i.putExtra("imgId" , imaId)
            startActivity(i)
        }
    }


}



//
//        val listView = binding.listView
//        val arrayList = arrayOf("C", "CPP", "PHP", "PYTHON", "SWIFT", "ANDROID", "GIT")
//        val arrayAdapter: ArrayAdapter<String> =
//            ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList)
//            listView.adapter = arrayAdapter
//        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
//            val selectedItem = adapterView.getItemAtPosition(position) as String
//            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
//
//            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
//        }
 //   }
//}

