package com.dev.myapplication.ui.list

sealed class ListItem {
    data class Movie(val title: String) : ListItem()
    data class Ads(val description: String) : ListItem()
    class Footer() : ListItem()
}
