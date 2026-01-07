package com.awesomeapp.location

sealed class State13_327 {
    data object Loading : State13_327()
    data class Success(val data: String) : State13_327()
    data class Error(val message: String) : State13_327()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}