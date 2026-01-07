package com.awesomeapp.sync

sealed class State15_1530 {
    data object Loading : State15_1530()
    data class Success(val data: String) : State15_1530()
    data class Error(val message: String) : State15_1530()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}