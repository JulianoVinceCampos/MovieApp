package br.com.julianovincedecampos.movie_feature.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.julianovincedecampos.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviePopularRepository {

    fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>>
}