package com.awesomeapp.push

sealed class State1_1137 {
    data object Loading : State1_1137()
    data class Success(val data: String) : State1_1137()
    data class Error(val message: String) : State1_1137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}