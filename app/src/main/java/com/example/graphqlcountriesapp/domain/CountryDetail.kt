package com.example.graphqlcountriesapp.domain

data class CountryDetail (
    val code: String,
    val name: String,
    val emoji: String,
    val capitol: String,
    val currency: String,
    val languages: List<String>,
    val continent: String
)

