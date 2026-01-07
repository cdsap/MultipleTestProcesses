package com.awesomeapp.app

sealed class State20_349 {
    data object Loading : State20_349()
    data class Success(val data: String) : State20_349()
    data class Error(val message: String) : State20_349()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}