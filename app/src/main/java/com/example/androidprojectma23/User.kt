package com.example.androidprojectma23

data class User(
    val displayName: String = "",
    val profileImage: String = "",
    val interests: MutableList<String> = mutableListOf()
)

