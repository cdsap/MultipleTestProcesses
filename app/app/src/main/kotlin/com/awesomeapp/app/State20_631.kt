package com.awesomeapp.app

sealed class State20_631 {
    data object Loading : State20_631()
    data class Success(val data: String) : State20_631()
    data class Error(val message: String) : State20_631()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}