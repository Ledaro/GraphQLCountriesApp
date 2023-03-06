package com.example.graphqlcountriesapp.domain

class GetCountriesUseCase(
    private val countryClient: CountryClient
) {
    suspend fun execute(): List<Country> {
        return countryClient
            .getCountries()
            .sortedBy { it.name }
    }
}
