package com.sadowska.compose_wordle.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sadowska.compose_wordle.ui.theme.ComposewordleTheme

@Composable
fun GuessRows(guesses: List<List<Char>>, tileStates: List<List<TileState>>) {
    Column {
        guesses.forEachIndexed { index, guess ->
            GuessRow(letters = guess, tileState = tileStates[index])
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF121213)
@Composable
fun GuessRowsPreview() {
    ComposewordleTheme {
        val emptyGuess = List(5) { ' ' }
        val emptyGuessState = List(5) { TileState.INACTIVE }
        GuessRows(
                guesses = listOf(
                        listOf('W', 'O', 'R', 'L', 'D'),
                        emptyGuess,
                        emptyGuess,
                        emptyGuess,
                        emptyGuess,
                ),
                tileStates = listOf(
                        listOf(
                                TileState.YELLOW,
                                TileState.GREEN,
                                TileState.GREY,
                                TileState.GREEN,
                                TileState.YELLOW
                        ),
                        emptyGuessState,
                        emptyGuessState,
                        emptyGuessState,
                        emptyGuessState,
                )
        )
    }
}