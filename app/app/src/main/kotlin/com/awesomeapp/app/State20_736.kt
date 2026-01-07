package com.awesomeapp.app

sealed class State20_736 {
    data object Loading : State20_736()
    data class Success(val data: String) : State20_736()
    data class Error(val message: String) : State20_736()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}