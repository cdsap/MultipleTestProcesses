package com.awesomeapp.sync

sealed class State15_558 {
    data object Loading : State15_558()
    data class Success(val data: String) : State15_558()
    data class Error(val message: String) : State15_558()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}