package br.com.julianovincedecampos.core.data.remote

import br.com.julianovincedecampos.core.data.remote.response.MovieResponse
import br.com.julianovincedecampos.core.data.remote.response.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("page")
        page: Int
    ): MovieResponse

    @GET("search/multi")
    suspend fun searchMovie(
        @Query("page") page: Int,
        @Query("query") query: String
    ): SearchResponse

    @GET("movie/{movie_id}")
    suspend fun getMovie(
        @Path("movie_id") movieId: Int
    ): MovieResponse

    @GET("movie/{movie_id}/similar")
    suspend fun getMoviesSimilar(
        @Path("movie_id") movieId: Int,
        @Query("page") page: Int
    ): MovieResponse

}