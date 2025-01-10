package com.example.hello_world.presentation.components.atom

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun BasicTextField(label: String, onChanged: (String) -> Unit) {
	var textState by remember { mutableStateOf(TextFieldValue("")) }

	Column(
		modifier = Modifier.padding(vertical = 5.dp)
	) {
		Text(text = label, color = Color.Black)
		TextField(
			value = textState,
			onValueChange = { data ->
				textState = data
				onChanged(data.text)
			},
			keyboardOptions = KeyboardOptions.Default.copy(
				keyboardType = KeyboardType.Email,
			),
			colors = TextFieldDefaults.colors(
				focusedIndicatorColor = Color.Transparent,
				unfocusedIndicatorColor = Color.Transparent
			),
			shape = RoundedCornerShape(5.dp),
			leadingIcon = null,
		)

	}
}