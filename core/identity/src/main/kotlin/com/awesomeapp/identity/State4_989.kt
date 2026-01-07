package com.awesomeapp.identity

sealed class State4_989 {
    data object Loading : State4_989()
    data class Success(val data: String) : State4_989()
    data class Error(val message: String) : State4_989()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}