package com.awesomeapp.share

sealed class State16_893 {
    data object Loading : State16_893()
    data class Success(val data: String) : State16_893()
    data class Error(val message: String) : State16_893()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}