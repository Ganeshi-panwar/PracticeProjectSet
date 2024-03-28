package com.ganeshi.practiceprojectset.RoomDataBase

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.ganeshi.practiceprojectset.R
//import com.ganeshi.practiceprojectset.RoomDataBase.tables.UserDetailsTable
import com.ganeshi.practiceprojectset.RoomDataBase.tables.UserTable
import com.ganeshi.practiceprojectset.databinding.ActivityRoomDataBaseMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RoomDataBaseMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoomDataBaseMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomDataBaseMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = DBHandler.getDB(this).getInstance(this)


        binding.insert.setOnClickListener {
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()
            val address = binding.yourAddress.text.toString()
            val email = binding.yourEmail.text.toString()


            lifecycleScope.launch(Dispatchers.IO) {
                // Insert data into the database
               val id =  db.userDao.insertAll(UserTable(firstName, lastName, address, email, 1))
                db.userDao.updateTable("ganeshi")
            }

//
//     db.userDao.insertAll(UserTable(firstName, lastName,address,email , 1 ))
//            print(db.userDao.getAll())


//            db.userDao.insertUserDetails(UserDetailsTable(id.toInt() , "Dehradun" ))
//            db.userDao.delete(2)
//            db.userDao.updateTable("ganeshu1111")
            startActivity(Intent(this@RoomDataBaseMainActivity , ShowRoomDataActivity::class.java ))

        }
        //        db.getInstance(this@RoomDataBaseMainActivity)
     //   binding.insert.setOnClickListener {
            //     db.userDao.insertAll(UserTable(1,"Ganeshiji" ,"Panwar" ,"Prem Nager" ,"ganeshi@gmail.com"))
//            println(db.userDao.getAll())
            //         db.userDao.delete(1)
    //    }


    }
}


