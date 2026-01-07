package com.awesomeapp.network

sealed class State14_915 {
    data object Loading : State14_915()
    data class Success(val data: String) : State14_915()
    data class Error(val message: String) : State14_915()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}