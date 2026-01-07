package com.awesomeapp.comment

sealed class State10_365 {
    data object Loading : State10_365()
    data class Success(val data: String) : State10_365()
    data class Error(val message: String) : State10_365()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}