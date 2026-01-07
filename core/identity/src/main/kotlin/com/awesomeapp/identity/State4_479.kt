package com.awesomeapp.identity

sealed class State4_479 {
    data object Loading : State4_479()
    data class Success(val data: String) : State4_479()
    data class Error(val message: String) : State4_479()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}