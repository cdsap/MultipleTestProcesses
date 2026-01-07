package com.awesomeapp.profile

sealed class State8_119 {
    data object Loading : State8_119()
    data class Success(val data: String) : State8_119()
    data class Error(val message: String) : State8_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}