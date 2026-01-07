package com.awesomeapp.network

sealed class State14_888 {
    data object Loading : State14_888()
    data class Success(val data: String) : State14_888()
    data class Error(val message: String) : State14_888()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}