package br.com.julianovincedecampos.movie_feature.data.mapper

import br.com.julianovincedecampos.core.data.remote.model.MovieResult
import br.com.julianovincedecampos.core.domain.model.Movie
import br.com.julianovincedecampos.core.util.toPostUrl

fun List<MovieResult>.toMovie() = map { movieResult ->
    Movie(
        id = movieResult.id,
        title = movieResult.title,
        voteAverage = movieResult.voteAverage,
        imageUrl = movieResult.posterPath.toPostUrl()
    )
}