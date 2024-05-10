package br.com.julianovincedecampos.search_movie_feature.data.source

import br.com.julianovincedecampos.core.data.remote.MovieService
import br.com.julianovincedecampos.core.data.remote.response.SearchResponse
import br.com.julianovincedecampos.core.paging.MovieSearchPagingSource
import br.com.julianovincedecampos.search_movie_feature.domain.source.MovieSearchRemoteDataSource
import javax.inject.Inject

class MovieSearchRemoteDataSourceImpl @Inject constructor(
    private val service: MovieService
) : MovieSearchRemoteDataSource {
    override fun getSearchMoviePagingSource(query: String): MovieSearchPagingSource {
        return MovieSearchPagingSource(query = query, remoteDataSource = this)
    }

    override suspend fun getSearchMovies(page: Int, query: String): SearchResponse {
        return service.searchMovie(page = page, query = query)
    }
}