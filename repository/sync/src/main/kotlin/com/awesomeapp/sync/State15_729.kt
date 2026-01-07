package com.awesomeapp.sync

sealed class State15_729 {
    data object Loading : State15_729()
    data class Success(val data: String) : State15_729()
    data class Error(val message: String) : State15_729()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}