package com.example.kotlin.utilities

import android.content.Context
import com.example.kotlin.db.AppDatabase
import com.example.kotlin.repository.UserRepository

/**
 * Static methods used to inject classes needed for various Activities and Fragments.
 */
object InjectorUtils {
    private fun getUserRepository(context: Context): UserRepository {
        return UserRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).userDao())
    }
}