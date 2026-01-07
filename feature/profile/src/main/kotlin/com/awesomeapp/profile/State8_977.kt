package com.awesomeapp.profile

sealed class State8_977 {
    data object Loading : State8_977()
    data class Success(val data: String) : State8_977()
    data class Error(val message: String) : State8_977()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}