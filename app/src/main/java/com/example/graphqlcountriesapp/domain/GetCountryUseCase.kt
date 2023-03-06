package com.example.graphqlcountriesapp.domain

class GetCountryUseCase(
    private val countryClient: CountryClient
) {
    suspend fun execute(code: String): CountryDetail? {
        return countryClient.getCountry(code)
    }
}
