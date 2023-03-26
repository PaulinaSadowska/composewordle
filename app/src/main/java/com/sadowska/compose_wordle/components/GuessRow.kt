package com.sadowska.compose_wordle.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sadowska.compose_wordle.ui.theme.ComposewordleTheme

@Composable
fun GuessRow(letters: List<Char>, tileState: List<TileState>) {
    Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
    ) {
        letters.forEachIndexed { index, c ->
            GuessTile(text = c, state = tileState[index])
        }

    }
}

@Preview(showBackground = true, backgroundColor = 0xFF121213)
@Composable
fun GuessRowPreview() {
    ComposewordleTheme {
        Column {
            GuessRow(
                    letters = listOf('W', 'O', 'R', 'L', 'D'),
                    tileState = listOf(
                            TileState.YELLOW,
                            TileState.GREEN,
                            TileState.GREY,
                            TileState.GREEN,
                            TileState.YELLOW
                    )
            )
            GuessRow(
                    letters = listOf('I', 'W', 'X', 'A', 'M'),
                    tileState = List(5) { TileState.INACTIVE }
            )
        }
    }
}
