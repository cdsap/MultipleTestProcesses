package com.awesomeapp.comment

sealed class State10_1133 {
    data object Loading : State10_1133()
    data class Success(val data: String) : State10_1133()
    data class Error(val message: String) : State10_1133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}