package com.awesomeapp.login

sealed class State3_427 {
    data object Loading : State3_427()
    data class Success(val data: String) : State3_427()
    data class Error(val message: String) : State3_427()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}