package com.awesomeapp.group

sealed class State17_429 {
    data object Loading : State17_429()
    data class Success(val data: String) : State17_429()
    data class Error(val message: String) : State17_429()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}