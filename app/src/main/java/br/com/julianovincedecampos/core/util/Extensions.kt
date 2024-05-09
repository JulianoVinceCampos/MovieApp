package br.com.julianovincedecampos.core.util

import br.com.br.com.julianovincedecampos.BuildConfig


fun String?.toPostUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"

fun String?.toBackdropUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"


