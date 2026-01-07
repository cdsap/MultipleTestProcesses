package com.awesomeapp.comment

sealed class State10_938 {
    data object Loading : State10_938()
    data class Success(val data: String) : State10_938()
    data class Error(val message: String) : State10_938()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}