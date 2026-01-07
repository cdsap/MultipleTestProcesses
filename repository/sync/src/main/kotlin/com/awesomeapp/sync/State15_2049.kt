package com.awesomeapp.sync

sealed class State15_2049 {
    data object Loading : State15_2049()
    data class Success(val data: String) : State15_2049()
    data class Error(val message: String) : State15_2049()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}