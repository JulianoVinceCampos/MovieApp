package br.com.julianovincedecampos.search_movie_feature.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.julianovincedecampos.core.domain.model.MovieSearch
import kotlinx.coroutines.flow.Flow

interface MovieSearchRepository {
    fun getSearchMovies(query:String, pagingConfig: PagingConfig): Flow<PagingData<MovieSearch>>
}