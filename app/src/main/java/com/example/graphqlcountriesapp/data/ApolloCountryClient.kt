package com.example.graphqlcountriesapp.data

import com.apollographql.apollo3.ApolloClient
import com.example.graphqlcountriesapp.CountriesQuery
import com.example.graphqlcountriesapp.CountryQuery
import com.example.graphqlcountriesapp.domain.Country
import com.example.graphqlcountriesapp.domain.CountryClient
import com.example.graphqlcountriesapp.domain.CountryDetail

class ApolloCountryClient(
    private val apolloClient: ApolloClient
) : CountryClient {
    override suspend fun getCountries(): List<Country> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map { it.toCountry() }
            ?: emptyList()
    }

    override suspend fun getCountry(code: String): CountryDetail? {
        return apolloClient
            .query(CountryQuery(code))
            .execute()
            .data
            ?.country
            ?.toCountryDetail()
    }
}
