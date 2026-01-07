package com.awesomeapp.search

sealed class State12_732 {
    data object Loading : State12_732()
    data class Success(val data: String) : State12_732()
    data class Error(val message: String) : State12_732()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}