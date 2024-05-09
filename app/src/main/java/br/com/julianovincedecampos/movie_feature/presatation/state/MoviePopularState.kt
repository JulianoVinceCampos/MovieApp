package br.com.julianovincedecampos.movie_feature.presatation.state

import androidx.paging.PagingData
import br.com.julianovincedecampos.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class MoviePopularState(
    val movies: Flow<PagingData<Movie>> = emptyFlow()
)
