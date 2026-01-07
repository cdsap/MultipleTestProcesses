package com.awesomeapp.sync

sealed class State15_351 {
    data object Loading : State15_351()
    data class Success(val data: String) : State15_351()
    data class Error(val message: String) : State15_351()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}