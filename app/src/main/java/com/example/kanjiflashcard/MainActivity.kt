package com.example.kanjiflashcard

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kanjiflashcard.ui.theme.KanjiFlashcardTheme

// HTTPS access
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

//import android.os.AsyncTask

// JSON
import java.io.File
import com.google.gson.Gson
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    // Called when the user starts the application
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        updateFlashcard()
    }

    // Updates the Flashcard (redoes the entire layout, with updated values)
    fun updateFlashcard() {
        setContent {
            KanjiFlashcardTheme {
                Layout()
            }
        }

    }

    // A collection of data on a Flashcard, the kanji and the (first) english meaning
    data class Flashcard(val kanji: String, val english: String)

    // The current card being displayed
    var currentCard = Flashcard("犬","dog")
    var count = 0 // DEBUG: Checking button presses
    var showKanji = true

    // A list of the first few kanji (maps with only the kanji and first english meanings)
    val kanjiList =
        listOf(mapOf("kanji" to "㐂","meanings" to listOf("")),
            mapOf("kanji" to "㐆","meaning" to "to depend on"),
            mapOf("kanji" to "㐬","meaning" to "a pennant"),
            mapOf("kanji" to "㐮","meaning" to "to achieve"),
            mapOf("kanji" to "㑨","meaning" to "great"),
            mapOf("kanji" to "㑪","meaning" to "a generation"),
            mapOf("kanji" to "㒒","meaning" to "a charioteer"),
            mapOf("kanji" to "㒵","meaning" to "appearance"),
            mapOf("kanji" to "犬","meaning" to "dog"),
            mapOf("kanji" to "猫","meaning" to "cat"),
            mapOf("kanji" to "先生","meaning" to "teacher"),
            mapOf("kanji" to "学校","meaning" to "school"),
            mapOf("kanji" to "亀","meaning" to "turtle"),
            mapOf("kanji" to "馬","meaning" to "horse"),
            mapOf("kanji" to "電気","meaning" to "electricity"),
            mapOf("kanji" to "電車","meaning" to "train"),
            mapOf("kanji" to "家","meaning" to "house"),
            mapOf("kanji" to "車","meaning" to "car"),
            mapOf("kanji" to "病院","meaning" to "hospital"),
            mapOf("kanji" to "飛行機","meaning" to "airplane"),
            mapOf("kanji" to "心","meaning" to "heart"),
            mapOf("kanji" to "元気","meaning" to "lively"),
            mapOf("kanji" to "病気","meaning" to "illness"),
            mapOf("kanji" to "帽子","meaning" to "hat"),
            mapOf("kanji" to "顔","meaning" to "face"),
            mapOf("kanji" to "文化","meaning" to "culture"),
            mapOf("kanji" to "仕事","meaning" to "job"),
            mapOf("kanji" to "寺","meaning" to "temple"),
            mapOf("kanji" to "子供","meaning" to "child"),
            mapOf("kanji" to "女","meaning" to "woman"),
            mapOf("kanji" to "男","meaning" to "man"),
            mapOf("kanji" to "父","meaning" to "father"),
            mapOf("kanji" to "母","meaning" to "mother"),
        )

    // The file location TODO: pack with application/store on device?
    // Original file of 13000 kanji is too large (all items on a single line)
    val filePath = "kanjiapi_test.json"

    // Create a random Flashcard
    fun createNewCard() : Flashcard {
        // TODO: Get from file

        //val file = File(filePath)
        // val jsonString = file.readText()

        // TODO: Mapping to a data class using Gson, was automatically converted
        //  to Kotlin from Java by Android Studio, so double check syntax
        //val card = Gson().fromJson(jsonString, Flashcard::class.java)

        // Get a random number between 0 and the size of the list of kanji
        val next = Random.nextInt(0, kanjiList.size)
        Log.d("List info", kanjiList[next]["kanji"].toString());

        // Create and return a Flashcard from the data
        val kanji = kanjiList[next]["kanji"].toString()
        val english = kanjiList[next]["meaning"].toString()
        return Flashcard(kanji, english)
    }

    // Display the English side of the flashcard
    @Composable
    fun DisplayEnglish(english: String) {
        Text(
            text = english,
            modifier = Modifier
                .padding(all = 20.dp)
                .size(150.dp),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.displayLarge,
        )
    }

    // Display the kanji side of the flashcard
    @Composable
    fun DisplayKanji(kanji: String) {
        Text(
            text = kanji,
            modifier = Modifier
                .wrapContentHeight(align = Alignment.CenterVertically)
                .padding(all = 20.dp)
                .size(150.dp),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.displayLarge
        )
    }

    @Composable
    fun DisplayFlashcard(flashcard: Flashcard) {
        // The surface of the card
        Surface(
            modifier = Modifier
                .padding(all = 25.dp)

                // Toggle flashcard side
                .clickable(onClick = { flipCard() } ),
            border = BorderStroke(2.dp, Color.Black)
        ) {
            if(showKanji) {
                DisplayKanji(flashcard.kanji)
            } else {
                DisplayEnglish(flashcard.english)
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewFlashcard() {
        DisplayFlashcard(currentCard)
    }

    @Composable
    fun Layout() {
        // TODO: Expand to size of application
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
            )   {
                // TODO: Menu in upper right, also deck name and #current/total (or random, if not chosen)
                Row(
                    modifier = Modifier
                    .fillMaxWidth()
                ) {
                    Button(onClick = { toggleMenu() }) {
                        Text("Menu")
                    }
                }

                // TODO: Center
                Surface(
                    modifier = Modifier
                    .fillMaxWidth()
                ) {
                    // Get current card
                    DisplayFlashcard(currentCard)
                }

                // TODO: Make Buttons the same size, add spacing
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
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

    @Preview(showBackground = true)
    @Composable
    fun PreviewLayout() {
        Layout()
    }

    // Change which side of the flashcard is shown
    fun flipCard() {
        showKanji = !showKanji
        updateFlashcard()
    }

    fun toggleMenu() {
        // Show/hide the menu
        Log.d("Button", "Pressed Menu");
    }

    fun nextCard() {
        // Get the next card from the deck
        // If no deck selected, get a random kanji card
        currentCard = createNewCard()
        updateFlashcard()
        //currentCard = createNewCard()
        count++
        Log.d("Button", "Pressed Next $count times")
    }

    fun addToDeck() {
        // Show list of decks to add to, or create new deck
        Log.d("Button", "Pressed Add");
    }
}