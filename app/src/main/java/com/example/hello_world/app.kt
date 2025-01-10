package com.example.hello_world

import androidx.compose.runtime.Composable
import com.example.hello_world.domain.entities.UserProfileEntities
import com.example.hello_world.presentation.pages.LoginPage
import kotlinx.serialization.json.Json.Default.decodeFromString
import kotlinx.serialization.json.Json.Default.encodeToString

@Composable
fun App() {
	val user = UserProfileEntities(234, "Ivan", "Ivan@gmail.com", "123456")
	val data = encodeToString(UserProfileEntities.serializer(), user)
	println("Json: $data")
	val response = decodeFromString<UserProfileEntities>(data)
	println("User: $response")

	println("Working Directory = ${System.getProperty("user.dir")}")
	println(BuildConfig.SUPABASE_URL_KEY)
	println(BuildConfig.SUPABASE_ANON_KEY)
	LoginPage()
}