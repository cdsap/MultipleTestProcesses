package com.awesomeapp.push

sealed class State1_765 {
    data object Loading : State1_765()
    data class Success(val data: String) : State1_765()
    data class Error(val message: String) : State1_765()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}