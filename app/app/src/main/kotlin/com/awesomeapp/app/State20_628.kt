package com.awesomeapp.app

sealed class State20_628 {
    data object Loading : State20_628()
    data class Success(val data: String) : State20_628()
    data class Error(val message: String) : State20_628()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}