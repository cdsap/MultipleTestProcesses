package com.awesomeapp.user

sealed class State7_519 {
    data object Loading : State7_519()
    data class Success(val data: String) : State7_519()
    data class Error(val message: String) : State7_519()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}