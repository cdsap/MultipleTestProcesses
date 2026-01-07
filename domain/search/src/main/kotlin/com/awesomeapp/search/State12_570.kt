package com.awesomeapp.search

sealed class State12_570 {
    data object Loading : State12_570()
    data class Success(val data: String) : State12_570()
    data class Error(val message: String) : State12_570()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}