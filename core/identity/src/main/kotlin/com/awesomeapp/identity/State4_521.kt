package com.awesomeapp.identity

sealed class State4_521 {
    data object Loading : State4_521()
    data class Success(val data: String) : State4_521()
    data class Error(val message: String) : State4_521()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}