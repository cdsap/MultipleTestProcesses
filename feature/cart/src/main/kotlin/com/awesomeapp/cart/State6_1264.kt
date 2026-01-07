package com.awesomeapp.cart

sealed class State6_1264 {
    data object Loading : State6_1264()
    data class Success(val data: String) : State6_1264()
    data class Error(val message: String) : State6_1264()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}