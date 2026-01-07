package com.awesomeapp.network

sealed class State14_927 {
    data object Loading : State14_927()
    data class Success(val data: String) : State14_927()
    data class Error(val message: String) : State14_927()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}