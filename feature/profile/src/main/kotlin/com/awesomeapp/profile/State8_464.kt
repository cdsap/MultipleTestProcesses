package com.awesomeapp.profile

sealed class State8_464 {
    data object Loading : State8_464()
    data class Success(val data: String) : State8_464()
    data class Error(val message: String) : State8_464()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}