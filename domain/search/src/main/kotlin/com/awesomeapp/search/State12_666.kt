package com.awesomeapp.search

sealed class State12_666 {
    data object Loading : State12_666()
    data class Success(val data: String) : State12_666()
    data class Error(val message: String) : State12_666()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}