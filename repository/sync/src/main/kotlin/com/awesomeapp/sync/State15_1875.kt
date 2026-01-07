package com.awesomeapp.sync

sealed class State15_1875 {
    data object Loading : State15_1875()
    data class Success(val data: String) : State15_1875()
    data class Error(val message: String) : State15_1875()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}