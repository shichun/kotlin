package com.example.kotlin.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tb_user")
data class User(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    val username: String,
    val password: String,
    val groupId: Int
)