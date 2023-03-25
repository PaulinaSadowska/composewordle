package com.sadowska.compose_wordle.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sadowska.compose_wordle.ui.theme.ComposewordleTheme
import com.sadowska.compose_wordle.ui.theme.KeyGray

@Composable
fun Key(text: String) {
    Box(
            modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(KeyGray)
                    .padding(10.dp)

    ) {
        Text(
                color = Color.White,
                text = text
        )
    }

}

@Preview(showBackground = true)
@Composable
fun KeyPreview() {
    ComposewordleTheme {
        Column {
            Key("ENTER")
            Key("A")
            Key("X")
        }
    }
}