package br.com.julianovincedecampos.movie_feature.data.source

import br.com.julianovincedecampos.core.data.remote.MovieService
import br.com.julianovincedecampos.core.data.remote.response.MovieResponse
import br.com.julianovincedecampos.core.paging.MoviePagingSource
import br.com.julianovincedecampos.movie_feature.domain.source.MoviePopularRemoteDataSource
import javax.inject.Inject


class MoviePopularRemoteDataSourceImpl @Inject constructor(
    private val service: MovieService
): MoviePopularRemoteDataSource {
    override fun getPopularMoviesPagingSource(): MoviePagingSource {
        return MoviePagingSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page = page)
    }

}