package com.sadowska.compose_wordle.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sadowska.compose_wordle.ui.theme.*

@Composable
fun GuessTile(text: Char, state: TileState) {
    Box(
            modifier = Modifier
                    .padding(4.dp)
                    .width(60.dp)
                    .applyBorder(state)
                    .background(state.toBackgroundColor())
                    .padding(top = 8.dp, bottom = 8.dp),
            contentAlignment = Alignment.Center
    ) {
        Text(
                color = Color.White,
                text = text.toString(),
                style = MaterialTheme.typography.h4
        )
    }

}

private fun Modifier.applyBorder(state: TileState) = if (state == TileState.INACTIVE) {
    this.border(BorderStroke(1.dp, InactiveTileBorder))
} else {
    this
}

private fun TileState.toBackgroundColor() = when (this) {
    TileState.INACTIVE -> BackgroundGray
    TileState.YELLOW -> Yellow
    TileState.GREEN -> Green
    TileState.GREY -> LightGrey
}

enum class TileState {
    YELLOW,
    GREEN,
    GREY,
    INACTIVE,
}

@Preview(showBackground = true, backgroundColor = 0xFF121213)
@Composable
fun GuessTilePreview() {
    ComposewordleTheme {
        Column {
            TileState.values().forEach {
                GuessTile(it.name.toCharArray().first(), it)
            }
        }
    }
}
