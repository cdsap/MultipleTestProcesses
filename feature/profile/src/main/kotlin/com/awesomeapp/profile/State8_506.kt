package com.awesomeapp.profile

sealed class State8_506 {
    data object Loading : State8_506()
    data class Success(val data: String) : State8_506()
    data class Error(val message: String) : State8_506()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}