package com.dev.myapplication.ui.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.myapplication.R
import kotlinx.coroutines.launch


@Composable
fun FooterItemView(listState: LazyListState) {
    val coroutineScope = rememberCoroutineScope()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                coroutineScope.launch {
                    listState.scrollToItem(0)  // Scroll to the top
                }
            }
            .background(MaterialTheme.colorScheme.background)
            .padding(vertical = 42.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Scroll to top",
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.baseline_keyboard_arrow_up_24), // Replace with your own icon
            contentDescription = "Scroll to top",
        )
    }
}

@Composable
@Preview
fun FooterItemViewPreview() {
    FooterItemView(listState = LazyListState())
}