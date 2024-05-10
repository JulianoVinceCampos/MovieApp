package br.com.julianovincedecampos.search_movie_feature.domain.source

import br.com.julianovincedecampos.core.data.remote.response.SearchResponse
import br.com.julianovincedecampos.core.paging.MovieSearchPagingSource

interface MovieSearchRemoteDataSource {
    fun getSearchMoviePagingSource(query: String): MovieSearchPagingSource
    suspend fun getSearchMovies(page: Int, query: String): SearchResponse
}