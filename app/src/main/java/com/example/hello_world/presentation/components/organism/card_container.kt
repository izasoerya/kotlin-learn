package com.example.hello_world.presentation.components.organism

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.hello_world.presentation.components.atom.BasicTextField

@Composable
fun CardContainer() {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 15.dp)
			.border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(10.dp))
			.clip(RoundedCornerShape(10.dp))
			.background(Color(0xFFE0E0E0))
			.padding(25.dp)
	) {
		BasicTextField(label = "Email", onChanged = {
			println(it)
		})
		BasicTextField(label = "Password", onChanged = {
			println(it)
		})
	}
}