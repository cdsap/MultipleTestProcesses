package com.awesomeapp.user

sealed class State7_975 {
    data object Loading : State7_975()
    data class Success(val data: String) : State7_975()
    data class Error(val message: String) : State7_975()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}