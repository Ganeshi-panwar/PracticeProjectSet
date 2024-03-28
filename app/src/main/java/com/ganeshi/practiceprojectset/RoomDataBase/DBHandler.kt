package com.ganeshi.practiceprojectset.RoomDataBase

import android.content.Context
import androidx.room.Room

object DBHandler {
    fun getDB(context: Context):UserDatabase{
        return Room.databaseBuilder(context, UserDatabase::class.java , "UserDatabase").allowMainThreadQueries().build()
    }
}