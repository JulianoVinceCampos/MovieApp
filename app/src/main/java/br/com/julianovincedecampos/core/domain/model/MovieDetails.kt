package br.com.julianovincedecampos.core.domain.model

data class MovieDetails(
    val id: Int,
    val title: String,
    val genres: List<String>,
    val overview: String?,
    val backdropPathUrl: String?,
    val releaseData: String?,
    val voteAverage: Double,
    val duration: Int = 0,
    val voteCount: Int = 0
)
