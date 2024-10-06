package com.dev.myapplication.ui.list

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MovieItemView(item: ListItem.Movie) {
    val context = LocalContext.current
    Text(
        text = item.title,
        color = MaterialTheme.colorScheme.onBackground,
        style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item.title, context) }
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    )
}

private fun onItemClick(text: String, context: Context) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}

@Composable
@Preview
fun MovieItemViewPreview() {
    MovieItemView(item = ListItem.Movie("La La Land"))
}