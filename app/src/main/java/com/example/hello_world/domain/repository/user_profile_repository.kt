package com.example.hello_world.domain.repository

import com.example.hello_world.domain.entities.UserProfileEntities

interface UserProfileRepository {
	fun createUserProfile(user: UserProfileEntities)
	fun readUserProfile(uid: String): UserProfileEntities
	fun updateUserProfile(uid: String)
	fun deleteUserProfile(uid: String)
}