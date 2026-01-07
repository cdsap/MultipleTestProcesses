package com.awesomeapp.push

sealed class State1_540 {
    data object Loading : State1_540()
    data class Success(val data: String) : State1_540()
    data class Error(val message: String) : State1_540()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}