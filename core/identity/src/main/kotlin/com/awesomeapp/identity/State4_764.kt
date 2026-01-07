package com.awesomeapp.identity

sealed class State4_764 {
    data object Loading : State4_764()
    data class Success(val data: String) : State4_764()
    data class Error(val message: String) : State4_764()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}