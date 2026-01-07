package com.awesomeapp.share

sealed class State16_437 {
    data object Loading : State16_437()
    data class Success(val data: String) : State16_437()
    data class Error(val message: String) : State16_437()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}