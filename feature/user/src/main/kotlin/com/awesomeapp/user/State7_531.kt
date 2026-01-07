package com.awesomeapp.user

sealed class State7_531 {
    data object Loading : State7_531()
    data class Success(val data: String) : State7_531()
    data class Error(val message: String) : State7_531()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}