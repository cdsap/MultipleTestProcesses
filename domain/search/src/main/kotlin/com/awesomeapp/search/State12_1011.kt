package com.awesomeapp.search

sealed class State12_1011 {
    data object Loading : State12_1011()
    data class Success(val data: String) : State12_1011()
    data class Error(val message: String) : State12_1011()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}