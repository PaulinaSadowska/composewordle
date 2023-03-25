package com.sadowska.compose_wordle.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sadowska.compose_wordle.ui.theme.ComposewordleTheme

@Composable
fun Header() {
    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
    ) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
        ) {
            Text(
                    color = Color.White,
                    text = "Wordle",
                    style = MaterialTheme.typography.h4
            )
        }
        Divider(thickness = 1.dp, color = Color.White)
    }
}

@Preview
@Composable
fun HeaderPreview() {
    ComposewordleTheme {
        Header()
    }
}