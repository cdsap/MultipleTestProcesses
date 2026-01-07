package com.awesomeapp.identity

sealed class State4_938 {
    data object Loading : State4_938()
    data class Success(val data: String) : State4_938()
    data class Error(val message: String) : State4_938()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}