package com.example.kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.db.AppDatabase
import com.example.kotlin.repository.UserRepository


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.)
//        setContentView<ActivityGardenBinding>(this, R.layout.activity_garden)
        val userDao = AppDatabase.getInstance(this).userDao()
        val userRepository =  UserRepository.getInstance(userDao);
    }
}