package com.awesomeapp.feed

sealed class State9_805 {
    data object Loading : State9_805()
    data class Success(val data: String) : State9_805()
    data class Error(val message: String) : State9_805()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}