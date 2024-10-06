package com.dev.myapplication.ui.list

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AdItemView(item: ListItem.Ads) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(MaterialTheme.colorScheme.tertiary)
            .padding(horizontal = 0.dp, vertical = 32.dp)
            .clickable { onItemClick(item.description, context) },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = item.description,
            color = MaterialTheme.colorScheme.onTertiary,
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
        )
    }
}

private fun onItemClick(text: String, context: Context) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}

@Composable
@Preview
fun AdItemViewPreview() {
    val item = ListItem.Ads("Sample Advertisement")
    AdItemView(item)
}