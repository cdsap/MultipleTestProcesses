package com.awesomeapp.sync

sealed class State15_1248 {
    data object Loading : State15_1248()
    data class Success(val data: String) : State15_1248()
    data class Error(val message: String) : State15_1248()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}