package com.awesomeapp.cart

sealed class State6_1240 {
    data object Loading : State6_1240()
    data class Success(val data: String) : State6_1240()
    data class Error(val message: String) : State6_1240()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}