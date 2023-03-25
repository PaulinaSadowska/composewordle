package com.sadowska.compose_wordle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sadowska.compose_wordle.components.Header
import com.sadowska.compose_wordle.components.Keyboard
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
    Column {
        Header()
        Keyboard()
    }
}

@Preview()
@Composable
fun GamePreview() {
    ComposewordleTheme {
        Game()
    }
}