package com.awesomeapp.network

sealed class State14_663 {
    data object Loading : State14_663()
    data class Success(val data: String) : State14_663()
    data class Error(val message: String) : State14_663()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}