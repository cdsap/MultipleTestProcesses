package com.awesomeapp.user

sealed class State7_720 {
    data object Loading : State7_720()
    data class Success(val data: String) : State7_720()
    data class Error(val message: String) : State7_720()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}