package com.sadowska.compose_wordle

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import com.sadowska.compose_wordle.components.GuessTile
import com.sadowska.compose_wordle.components.TileState
import org.junit.Rule
import org.junit.Test

class GuessTileTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun guessTile_textIsCorrect() {
        val text = 'A'
        val state = TileState.GREEN
        composeTestRule.setContent {
            GuessTile(text = text, state = state)
        }
        composeTestRule.onNode(hasText(text.toString())).assertExists()
    }
}
