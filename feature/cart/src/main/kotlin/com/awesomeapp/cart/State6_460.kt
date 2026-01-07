package com.awesomeapp.cart

sealed class State6_460 {
    data object Loading : State6_460()
    data class Success(val data: String) : State6_460()
    data class Error(val message: String) : State6_460()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}