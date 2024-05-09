package br.com.julianovincedecampos.movie_feature.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.julianovincedecampos.core.domain.model.Movie
import br.com.julianovincedecampos.movie_feature.domain.repository.MoviePopularRepository
import br.com.julianovincedecampos.movie_feature.domain.source.MoviePopularRemoteDataSource
import kotlinx.coroutines.flow.Flow

class MoviePopularRepositoryImpl constructor(
    private val remoteDataSource: MoviePopularRemoteDataSource
): MoviePopularRepository {

    override fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>> {
        return Pager(
            config = pagingConfig,
            pagingSourceFactory = {
                remoteDataSource.getPopularMoviesPagingSource()
            }
        ).flow
    }
}