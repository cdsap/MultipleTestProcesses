package com.awesomeapp.search

sealed class State12_441 {
    data object Loading : State12_441()
    data class Success(val data: String) : State12_441()
    data class Error(val message: String) : State12_441()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}