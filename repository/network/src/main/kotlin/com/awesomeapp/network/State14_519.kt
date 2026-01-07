package com.awesomeapp.network

sealed class State14_519 {
    data object Loading : State14_519()
    data class Success(val data: String) : State14_519()
    data class Error(val message: String) : State14_519()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}