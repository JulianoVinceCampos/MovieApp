package br.com.julianovincedecampos.core.data.remote.response

import br.com.julianovincedecampos.core.data.remote.model.Genre
import br.com.julianovincedecampos.core.data.remote.model.ProductionCompany
import br.com.julianovincedecampos.core.data.remote.model.ProductionCountry
import br.com.julianovincedecampos.core.data.remote.model.SpokenLanguage
import com.google.gson.annotations.SerializedName

data class Movie(
    val adult: Boolean,
    @SerializedName("backdrop_path") val backdropPath: String,
    val budget: Int,
    val genres: List<Genre>,
    val homepage: String,
    val id: Int,
    @SerializedName("imdb_id") val imdbId: String,
    @SerializedName("origin_country") val originCountry: List<String>,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("original_title") val originalTitle: String,
    val overview: String,
    val popularity: Double,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("production_companies") val productionCompanies: List<ProductionCompany>,
    @SerializedName("production_countries") val productionCountries: List<ProductionCountry>,
    @SerializedName("release_date") val releaseDate: String,
    val revenue: Long,
    val runtime: Int,
    @SerializedName("spoken_languages") val spokenLanguages: List<SpokenLanguage>,
    val status: String,
    val tagline: String,
    val title: String,
    val video: Boolean,
    @SerializedName("vote_average") val voteAverage: Double,
    @SerializedName("vote_count") val voteCount: Int
)
