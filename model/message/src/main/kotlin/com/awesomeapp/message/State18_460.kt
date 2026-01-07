package com.awesomeapp.message

sealed class State18_460 {
    data object Loading : State18_460()
    data class Success(val data: String) : State18_460()
    data class Error(val message: String) : State18_460()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}