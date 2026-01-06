package com.awesomeapp.location

sealed class State13_339 {
    data object Loading : State13_339()
    data class Success(val data: String) : State13_339()
    data class Error(val message: String) : State13_339()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}