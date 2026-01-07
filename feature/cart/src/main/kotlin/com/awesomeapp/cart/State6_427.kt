package com.awesomeapp.cart

sealed class State6_427 {
    data object Loading : State6_427()
    data class Success(val data: String) : State6_427()
    data class Error(val message: String) : State6_427()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}