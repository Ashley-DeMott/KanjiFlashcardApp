package com.example.kanjiflashcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kanjiflashcard.ui.theme.KanjiFlashcardTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.border
import androidx.compose.foundation.BorderStroke
import android.content.res.Configuration
import android.view.Gravity
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.clickable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

// Button types
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TextButton
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KanjiFlashcardTheme {
                Layout()
            }
        }
    }
}

// Create class for app? (current state)

// Create class for Decks
//  Create a deck
//  Save deck to local storage
//  Select deck to go through

// Create class for Flashcard
class Flashcard(kanji: String, english:String, startSide: Int = 0) {
 /*
 // cardSides = listOf("Kanji", "English") // Can add more (on-yomi/kun-yomi, stroke order, etc

    // A map of the different sides of the Flashcard (Cards)
    private var sides = mapOf("Kanji" to Card(kanji), "English" to Card(english))

    // Starts on the Kanji side by default
    private var currentSide = startSide

    fun flipCard() {
        currentSide = if (currentSide == "Kanji") "English" else "Kanji"
    }

    fun displayCard() {
        sides[currentSide]
    }
  */
}

// TODO: Make kanji, english, etc versions of cards (Card filled with different content)

@Composable
fun Flashcard(kanji: String) {
    // TODO: Add drop shadow on outside
    Surface(modifier = Modifier.padding(all = 25.dp),
            border = BorderStroke(2.dp, Color.Black)) {
        Text(
            text = kanji,
            modifier = Modifier
                .padding(all = 5.dp)
                .size(100.dp),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.displayLarge)
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewFlashcard() {
    Flashcard(kanji = "猫")
}

fun toggleMenu() {
    // Show/hide the menu

}

fun nextCard() {
    // Get the next card from the deck
    // If no deck selected, get a random kanji card
}

fun addToDeck() {
    // Show list of decks to add to, or create new deck
}


@Composable
fun Layout() {
    Surface() {
        Column() {
            // TODO: Menu in upper right, also deck name and #current/total (or random, if not chosen)
            Row() {
                Button(onClick = { toggleMenu() }) {
                    Text("Menu")
                }
            }

            // TODO: Center
            Surface() {
                // Get current card
                Flashcard(kanji = "猫")
            }

            // TODO: Make Buttons the same size, add spacing
            Row() {
                // TODO: Replace with image + and ->, labels?
                Button(onClick = { addToDeck() }) {
                    Text("Save to deck")
                }
                Button(onClick = { nextCard() }) {
                    Text("Next")
                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewLayout() {
    Layout()
}
