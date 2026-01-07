package com.awesomeapp.login

sealed class State3_448 {
    data object Loading : State3_448()
    data class Success(val data: String) : State3_448()
    data class Error(val message: String) : State3_448()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}