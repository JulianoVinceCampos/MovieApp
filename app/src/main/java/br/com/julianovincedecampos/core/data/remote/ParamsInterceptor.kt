package br.com.julianovincedecampos.core.data.remote

import br.com.br.com.julianovincedecampos.BuildConfig
import br.com.julianovincedecampos.core.util.Constants
import okhttp3.Interceptor
import okhttp3.Response

class ParamsInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        val url = request.url.newBuilder()
            .addQueryParameter(Constants.LANGUAGE_PARAM, Constants.LANGUAGE_VALUE)
            .addQueryParameter(Constants.API_KEY_PARAM, BuildConfig.API_KEY)
            .build()

        val newRequest = request
            .newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}