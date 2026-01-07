package com.awesomeapp.push

sealed class State1_831 {
    data object Loading : State1_831()
    data class Success(val data: String) : State1_831()
    data class Error(val message: String) : State1_831()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}