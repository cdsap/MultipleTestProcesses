package com.awesomeapp.user

sealed class State7_666 {
    data object Loading : State7_666()
    data class Success(val data: String) : State7_666()
    data class Error(val message: String) : State7_666()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}