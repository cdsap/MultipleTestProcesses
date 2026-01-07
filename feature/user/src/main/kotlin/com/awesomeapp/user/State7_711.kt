package com.awesomeapp.user

sealed class State7_711 {
    data object Loading : State7_711()
    data class Success(val data: String) : State7_711()
    data class Error(val message: String) : State7_711()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}