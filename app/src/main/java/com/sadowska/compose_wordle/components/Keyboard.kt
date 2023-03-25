package com.sadowska.compose_wordle.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sadowska.compose_wordle.ui.theme.ComposewordleTheme

@Composable
fun Keyboard() {
    Column {
        allKeys.forEach { rows ->
            Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
            ) {
                rows.forEach {
                    Key(it)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KeyboardPreview() {
    ComposewordleTheme {
        Keyboard()
    }
}

private val allKeys = listOf(
        listOf("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"),
        listOf("A", "S", "D", "F", "G", "H", "J", "K", "L"),
        listOf("ENTER", "Z", "X", "C", "V", "B", "N", "M", "«")
)

/*

.key-container button:nth-child(11) {
  margin-left: 30px;
}

.key-container button:nth-child(20),
.key-container button:nth-child(28) {
  width: 68px;
}
 */