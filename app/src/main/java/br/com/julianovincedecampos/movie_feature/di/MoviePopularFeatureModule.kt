package br.com.julianovincedecampos.movie_feature.di

import br.com.julianovincedecampos.core.data.remote.MovieService
import br.com.julianovincedecampos.movie_feature.data.repository.MoviePopularRepositoryImpl
import br.com.julianovincedecampos.movie_feature.data.source.MoviePopularRemoteDataSourceImpl
import br.com.julianovincedecampos.movie_feature.domain.repository.MoviePopularRepository
import br.com.julianovincedecampos.movie_feature.domain.source.MoviePopularRemoteDataSource
import br.com.julianovincedecampos.movie_feature.domain.usecase.GetPopularMoviesUseCase
import br.com.julianovincedecampos.movie_feature.domain.usecase.GetPopularMoviesUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviePopularFeatureModule {

    @Provides
    @Singleton
    fun provideMovieDataSource(service: MovieService): MoviePopularRemoteDataSource {
        return MoviePopularRemoteDataSourceImpl(service = service)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(remoteDataSource: MoviePopularRemoteDataSource): MoviePopularRepository {
        return MoviePopularRepositoryImpl(remoteDataSource = remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideGetMoviesPopularUseCase(moviePopularRepository: MoviePopularRepository) : GetPopularMoviesUseCase{
        return GetPopularMoviesUseCaseImpl(repository = moviePopularRepository)
    }
}