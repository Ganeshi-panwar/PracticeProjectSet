package com.ganeshi.practiceprojectset.RoomDataBase

import android.content.Context
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RenameTable
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.AutoMigrationSpec
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.ganeshi.practiceprojectset.RoomDataBase.tables.UserTable
import kotlin.reflect.KParameter

@Database(
    entities = [UserTable::class],
    version = 2
)
abstract class UserDatabase:RoomDatabase() {
    abstract val userDao: UserDao
//abstract fun userDao(): UserDao

    private val MIGRATION_1_2 = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE UserTable ADD COLUMN is_active INTEGER NOT NULL DEFAULT(0)")
        }
    }

    private var INSTANCE:UserDatabase? = null
    fun getInstance(context: Context): UserDatabase {
        if (INSTANCE == null) {
            synchronized(this) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, UserDatabase::class.java, "UserDatabase")
                    .addMigrations(MIGRATION_1_2)
                    .build()
            }
        }
        return INSTANCE!!
    }

}






//@Database(
//    version = 2,
//    entities = [UserTable::class],
//    autoMigrations = [AutoMigration (
//            from = 1,
//            to = 2,
//            spec = UserDatabase.MyAutoMigration::class
//        )
//    ]
//
//)
//abstract class UserDatabase:RoomDatabase() {
//    abstract val userDao:UserDao
//@RenameTable(fromTableName = "UserTable" , toTableName = "GaneashiData")
//class MyAutoMigration:AutoMigrationSpec
//
//}