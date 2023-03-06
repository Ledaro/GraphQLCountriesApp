package com.example.graphqlcountriesapp.data

import com.example.graphqlcountriesapp.CountriesQuery
import com.example.graphqlcountriesapp.CountryQuery
import com.example.graphqlcountriesapp.domain.Country
import com.example.graphqlcountriesapp.domain.CountryDetail

fun CountriesQuery.Country.toCountry(): Country {
    return Country(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No capital",
    )
}

fun CountryQuery.Country.toCountryDetail(): CountryDetail {
    return CountryDetail(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No capital",
        currency = currency ?: "No currency",
        languages = languages.mapNotNull { it.name },
        continent = continent.name
    )
}
