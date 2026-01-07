package com.awesomeapp.group

sealed class State17_432 {
    data object Loading : State17_432()
    data class Success(val data: String) : State17_432()
    data class Error(val message: String) : State17_432()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}