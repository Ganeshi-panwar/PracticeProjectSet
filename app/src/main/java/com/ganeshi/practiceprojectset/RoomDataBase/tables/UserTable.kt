package com.ganeshi.practiceprojectset.RoomDataBase.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class UserTable(

    @ColumnInfo(name = "first_name") val firstName:String? ,
    @ColumnInfo(name = "last_name") val lastName:String?,
    @ColumnInfo(name = "address")  val address:String?,
    @ColumnInfo(name = "email") val email:String?,
    @ColumnInfo(name = "is_active") val isActive: Int = 0 ,
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0 ,
)
