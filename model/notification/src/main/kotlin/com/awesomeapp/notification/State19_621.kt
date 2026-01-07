package com.awesomeapp.notification

sealed class State19_621 {
    data object Loading : State19_621()
    data class Success(val data: String) : State19_621()
    data class Error(val message: String) : State19_621()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}