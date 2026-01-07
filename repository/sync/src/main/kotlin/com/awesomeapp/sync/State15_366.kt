package com.awesomeapp.sync

sealed class State15_366 {
    data object Loading : State15_366()
    data class Success(val data: String) : State15_366()
    data class Error(val message: String) : State15_366()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}