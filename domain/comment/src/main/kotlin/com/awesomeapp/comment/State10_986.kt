package com.awesomeapp.comment

sealed class State10_986 {
    data object Loading : State10_986()
    data class Success(val data: String) : State10_986()
    data class Error(val message: String) : State10_986()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}