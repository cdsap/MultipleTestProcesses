package com.awesomeapp.share

sealed class State16_1565 {
    data object Loading : State16_1565()
    data class Success(val data: String) : State16_1565()
    data class Error(val message: String) : State16_1565()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}