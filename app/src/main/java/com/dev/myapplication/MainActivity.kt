package com.dev.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dev.myapplication.ui.list.ListItem
import com.dev.myapplication.ui.list.MultiTypeList
import com.dev.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ItemClickedScreen()
                }
            }
        }
    }
}

@Composable
fun ItemClickedScreen() {
    Surface {
        MultiTypeList(listItems = sampleData)
    }
}

@Preview
@Composable
fun PreviewSimpleTextList() {
    ItemClickedScreen()
}

val sampleData = listOf(
    ListItem.Movie("The Godfather"),
    ListItem.Movie("Pulp Fiction"),
    ListItem.Movie("The Shawshank Redemption"),
    ListItem.Movie("Inception"),
    ListItem.Ads("This is an advertisement"),
    ListItem.Movie("The Dark Knight"),
    ListItem.Movie("Fight Club"),
    ListItem.Movie("Gladiator"),
    ListItem.Movie("Jurassic Park"),
    ListItem.Ads("This is an advertisement"),
    ListItem.Movie("Titanic"),
    ListItem.Movie("Star Wars: A New Hope"),
    ListItem.Movie("Goodfellas"),
    ListItem.Movie("Schindler’s List"),
    ListItem.Ads("This is an advertisement"),
    ListItem.Movie("The Lord of the Rings: The Fellowship of the Ring"),
    ListItem.Movie("Avatar"),
    ListItem.Movie("The Lion King"),
    ListItem.Movie("Terminator 2: Judgment Day"),
    ListItem.Ads("This is an advertisement"),
    ListItem.Movie("Saving Private Ryan"),
    ListItem.Movie("The Silence of the Lambs"),
    ListItem.Movie("E.T. the Extra-Terrestrial"),
    ListItem.Movie("Interstellar"),
    ListItem.Ads("This is an advertisement"),
    ListItem.Movie("The Usual Suspects"),
    ListItem.Movie("Braveheart"),
    ListItem.Movie("A Clockwork Orange"),
    ListItem.Movie("The Great Escape"),
    ListItem.Footer()
)