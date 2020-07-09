package com.example.kotlin.repository

import com.example.kotlin.dao.UserDao


class UserRepository private constructor(private val userDao: UserDao) {

    fun getUsers() = userDao.getUsers()

    fun getUser(id: String) = userDao.getUser(id)

//    fun getPlantsWithGrowZoneNumber(growZoneNumber: Int) =
//        plantDao.getPlantsWithGrowZoneNumber(growZoneNumber)

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: UserRepository? = null

        fun getInstance(userDao: UserDao) =
            instance ?: synchronized(this) {
                instance ?: UserRepository(userDao).also { instance = it }
            }
    }
}
