package br.com.julianovincedecampos.core.domain.model

data class Movie (
    val id:Int,
    val title: String,
    val voteAverage:Double = 0.0,
    val imageUrl:String = ""
)