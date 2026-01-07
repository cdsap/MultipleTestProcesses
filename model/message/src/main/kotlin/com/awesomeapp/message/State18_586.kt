package com.awesomeapp.message

sealed class State18_586 {
    data object Loading : State18_586()
    data class Success(val data: String) : State18_586()
    data class Error(val message: String) : State18_586()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}