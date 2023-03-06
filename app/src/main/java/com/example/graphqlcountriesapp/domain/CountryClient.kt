package com.example.graphqlcountriesapp.domain

interface CountryClient {
    suspend fun getCountries(): List<Country>
    suspend fun getCountry(code: String): CountryDetail?
}
