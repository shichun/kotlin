package com.example.kotlin.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlin.entity.User


@Dao
interface UserDao {
    @Query("SELECT * FROM tb_user ORDER BY username")
    fun getUsers(): LiveData<List<User>>

//    @Query("SELECT * FROM tb_user WHERE growZoneNumber = :growZoneNumber ORDER BY name")
//    fun getPlantsWithGrowZoneNumber(growZoneNumber: Int): LiveData<List<Plant>>

    @Query("SELECT * FROM tb_user WHERE id = :id")
    fun getUser(id: String): LiveData<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<User>)
}