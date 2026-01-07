package com.awesomeapp.user

sealed class State7_441 {
    data object Loading : State7_441()
    data class Success(val data: String) : State7_441()
    data class Error(val message: String) : State7_441()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}