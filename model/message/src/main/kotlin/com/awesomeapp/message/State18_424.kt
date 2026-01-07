package com.awesomeapp.message

sealed class State18_424 {
    data object Loading : State18_424()
    data class Success(val data: String) : State18_424()
    data class Error(val message: String) : State18_424()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}