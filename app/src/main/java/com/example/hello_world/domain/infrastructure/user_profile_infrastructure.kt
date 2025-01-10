package com.example.hello_world.domain.infrastructure

import com.example.hello_world.domain.entities.UserProfileEntities
import com.example.hello_world.domain.repository.UserProfileRepository

class UserProfileInfrastructure : UserProfileRepository {
	override fun createUserProfile(user: UserProfileEntities) {
		TODO("Not yet implemented")
	}

	override fun readUserProfile(uid: String): UserProfileEntities {
		TODO("Not yet implemented")
	}

	override fun updateUserProfile(uid: String) {
		TODO("Not yet implemented")
	}

	override fun deleteUserProfile(uid: String) {
		TODO("Not yet implemented")
	}
}