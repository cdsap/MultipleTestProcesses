package com.awesomeapp.group

sealed class State17_450 {
    data object Loading : State17_450()
    data class Success(val data: String) : State17_450()
    data class Error(val message: String) : State17_450()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}