package com.sadowska.compose_wordle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sadowska.compose_wordle.components.GuessRows
import com.sadowska.compose_wordle.components.Header
import com.sadowska.compose_wordle.components.Keyboard
import com.sadowska.compose_wordle.components.TileState
import com.sadowska.compose_wordle.ui.theme.ComposewordleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposewordleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Game()
                }
            }
        }
    }
}

@Composable
fun Game() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            Header()
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
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            Keyboard()
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF121213)
@Composable
fun GamePreview() {
    ComposewordleTheme {
        Game()
    }
}