package br.com.julianovincedecampos.search_movie_feature.data.mapper

import br.com.julianovincedecampos.core.data.remote.model.SearchResult
import br.com.julianovincedecampos.core.domain.model.MovieSearch
import br.com.julianovincedecampos.core.util.toPostUrl

fun List<SearchResult>.toMovieSearch() = map { searchResult ->
    MovieSearch(
        id = searchResult.id,
        imageUrl = searchResult.posterPath.toPostUrl(),
        voteAverage = searchResult.voteAverage
    )
}