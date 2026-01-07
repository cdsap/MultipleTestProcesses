package com.awesomeapp.push

sealed class State1_519 {
    data object Loading : State1_519()
    data class Success(val data: String) : State1_519()
    data class Error(val message: String) : State1_519()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}