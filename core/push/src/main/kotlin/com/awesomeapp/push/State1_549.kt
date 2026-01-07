package com.awesomeapp.push

sealed class State1_549 {
    data object Loading : State1_549()
    data class Success(val data: String) : State1_549()
    data class Error(val message: String) : State1_549()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}