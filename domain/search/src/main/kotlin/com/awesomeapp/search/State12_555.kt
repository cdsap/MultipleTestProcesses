package com.awesomeapp.search

sealed class State12_555 {
    data object Loading : State12_555()
    data class Success(val data: String) : State12_555()
    data class Error(val message: String) : State12_555()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}