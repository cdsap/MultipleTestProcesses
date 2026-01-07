package com.awesomeapp.app

sealed class State20_766 {
    data object Loading : State20_766()
    data class Success(val data: String) : State20_766()
    data class Error(val message: String) : State20_766()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}