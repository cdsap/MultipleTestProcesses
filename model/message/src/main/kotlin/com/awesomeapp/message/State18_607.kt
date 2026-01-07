package com.awesomeapp.message

sealed class State18_607 {
    data object Loading : State18_607()
    data class Success(val data: String) : State18_607()
    data class Error(val message: String) : State18_607()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}