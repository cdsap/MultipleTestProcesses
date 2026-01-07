package com.awesomeapp.location

sealed class State13_474 {
    data object Loading : State13_474()
    data class Success(val data: String) : State13_474()
    data class Error(val message: String) : State13_474()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}