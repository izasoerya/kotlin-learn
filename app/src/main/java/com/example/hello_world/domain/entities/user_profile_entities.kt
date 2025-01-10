package com.example.hello_world.domain.entities

import kotlinx.serialization.*

@Serializable
data class UserProfileEntities(
	@SerialName("uid") val uid: Int,
	@SerialName("name") val name: String,
	@SerialName("email") val email: String,
	@SerialName("password") val password: String
)
