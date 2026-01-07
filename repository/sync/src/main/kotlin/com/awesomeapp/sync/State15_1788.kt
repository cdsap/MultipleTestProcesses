package com.awesomeapp.sync

sealed class State15_1788 {
    data object Loading : State15_1788()
    data class Success(val data: String) : State15_1788()
    data class Error(val message: String) : State15_1788()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}