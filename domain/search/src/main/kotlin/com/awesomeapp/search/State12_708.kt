package com.awesomeapp.search

sealed class State12_708 {
    data object Loading : State12_708()
    data class Success(val data: String) : State12_708()
    data class Error(val message: String) : State12_708()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}