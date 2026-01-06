package com.awesomeapp.network

sealed class State14_345 {
    data object Loading : State14_345()
    data class Success(val data: String) : State14_345()
    data class Error(val message: String) : State14_345()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}