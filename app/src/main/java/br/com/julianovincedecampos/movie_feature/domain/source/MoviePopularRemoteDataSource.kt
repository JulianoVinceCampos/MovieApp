package br.com.julianovincedecampos.movie_feature.domain.source

import br.com.julianovincedecampos.core.data.remote.response.MovieResponse
import br.com.julianovincedecampos.core.paging.MoviePagingSource

interface MoviePopularRemoteDataSource {

    fun getPopularMoviesPagingSource(): MoviePagingSource

    suspend fun getPopularMovies(page: Int): MovieResponse

}