package com.awesomeapp.cart

sealed class State6_883 {
    data object Loading : State6_883()
    data class Success(val data: String) : State6_883()
    data class Error(val message: String) : State6_883()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}