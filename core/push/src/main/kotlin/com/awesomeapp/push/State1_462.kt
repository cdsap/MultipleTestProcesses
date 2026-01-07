package com.awesomeapp.push

sealed class State1_462 {
    data object Loading : State1_462()
    data class Success(val data: String) : State1_462()
    data class Error(val message: String) : State1_462()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}