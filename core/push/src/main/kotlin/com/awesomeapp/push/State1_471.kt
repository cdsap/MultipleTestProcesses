package com.awesomeapp.push

sealed class State1_471 {
    data object Loading : State1_471()
    data class Success(val data: String) : State1_471()
    data class Error(val message: String) : State1_471()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}