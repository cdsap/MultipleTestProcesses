package com.awesomeapp.cart

sealed class State6_979 {
    data object Loading : State6_979()
    data class Success(val data: String) : State6_979()
    data class Error(val message: String) : State6_979()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}