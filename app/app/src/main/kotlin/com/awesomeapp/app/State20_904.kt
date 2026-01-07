package com.awesomeapp.app

sealed class State20_904 {
    data object Loading : State20_904()
    data class Success(val data: String) : State20_904()
    data class Error(val message: String) : State20_904()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}