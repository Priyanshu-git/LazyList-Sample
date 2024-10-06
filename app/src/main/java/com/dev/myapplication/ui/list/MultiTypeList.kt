package com.dev.myapplication.ui.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable

@Composable
fun MultiTypeList(listItems: List<ListItem>) {
    val listState = rememberLazyListState()

    LazyColumn(state = listState) {
        itemsIndexed(listItems) { _, item ->
            when (item) {
                is ListItem.Movie -> MovieItemView(item)
                is ListItem.Ads -> AdItemView(item)
                is ListItem.Footer -> FooterItemView(listState)
            }
        }
    }
}