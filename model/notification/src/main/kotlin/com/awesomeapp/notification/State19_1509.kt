package com.awesomeapp.notification

sealed class State19_1509 {
    data object Loading : State19_1509()
    data class Success(val data: String) : State19_1509()
    data class Error(val message: String) : State19_1509()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}