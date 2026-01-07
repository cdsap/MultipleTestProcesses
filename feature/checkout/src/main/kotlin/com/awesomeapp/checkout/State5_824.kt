package com.awesomeapp.checkout

sealed class State5_824 {
    data object Loading : State5_824()
    data class Success(val data: String) : State5_824()
    data class Error(val message: String) : State5_824()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}