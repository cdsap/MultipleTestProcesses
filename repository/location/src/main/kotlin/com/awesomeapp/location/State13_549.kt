package com.awesomeapp.location

sealed class State13_549 {
    data object Loading : State13_549()
    data class Success(val data: String) : State13_549()
    data class Error(val message: String) : State13_549()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}