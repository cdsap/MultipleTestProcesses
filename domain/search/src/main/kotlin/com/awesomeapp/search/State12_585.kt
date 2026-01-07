package com.awesomeapp.search

sealed class State12_585 {
    data object Loading : State12_585()
    data class Success(val data: String) : State12_585()
    data class Error(val message: String) : State12_585()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}