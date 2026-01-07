package com.awesomeapp.comment

sealed class State10_1145 {
    data object Loading : State10_1145()
    data class Success(val data: String) : State10_1145()
    data class Error(val message: String) : State10_1145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}