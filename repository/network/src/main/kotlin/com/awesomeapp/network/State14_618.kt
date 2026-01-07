package com.awesomeapp.network

sealed class State14_618 {
    data object Loading : State14_618()
    data class Success(val data: String) : State14_618()
    data class Error(val message: String) : State14_618()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}