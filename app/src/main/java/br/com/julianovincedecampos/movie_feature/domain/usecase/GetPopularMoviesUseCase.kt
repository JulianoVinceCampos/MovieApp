package br.com.julianovincedecampos.movie_feature.domain.usecase

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.julianovincedecampos.core.domain.model.Movie
import br.com.julianovincedecampos.movie_feature.domain.repository.MoviePopularRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetPopularMoviesUseCase {
    operator fun invoke(): Flow<PagingData<Movie>>
}

class GetPopularMoviesUseCaseImpl @Inject constructor(
    private val repository: MoviePopularRepository
) : GetPopularMoviesUseCase {
    override fun invoke(): Flow<PagingData<Movie>> {
        return repository.getPopularMovies(
            pagingConfig = PagingConfig(
                pageSize = 20,
                initialLoadSize = 20
            )
        )
    }
}