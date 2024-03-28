package com.ganeshi.practiceprojectset.RoomDataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

import com.ganeshi.practiceprojectset.RoomDataBase.tables.UserTable

@Dao
interface UserDao {
    @Query("SELECT * FROM usertable")
    fun getAll():List<UserTable>

//    @Query("SELECT * FROM UserTable WHERE first_name LIKE :firstName AND last_name LIKE :lastName LIMIT 1")
//     fun  findByName(firstName: String , lastName: String): UserTable

     @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertAll( userTable: UserTable)
//      @Insert
//      fun insertUserDetails(userDetailsTable: UserDetailsTable)


     @Query("delete from 'UserTable' where uid= :uid")
     fun delete(uid: Int)

     @Query("Update 'UserTable' Set first_name = :userName")
             fun updateTable(userName:String)




}


