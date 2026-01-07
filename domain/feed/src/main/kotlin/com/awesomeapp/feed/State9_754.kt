package com.awesomeapp.feed

sealed class State9_754 {
    data object Loading : State9_754()
    data class Success(val data: String) : State9_754()
    data class Error(val message: String) : State9_754()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}