package br.com.julianovincedecampos.core.util

import timber.log.Timber

object UitlFunctions {

    fun logError(tag: String, message:String) {
        Timber.tag(tag).e("Error -> $message")
    }

    fun logInfo(tag: String, message:String) {
        Timber.tag(tag).i("Error -> $message")
    }

}