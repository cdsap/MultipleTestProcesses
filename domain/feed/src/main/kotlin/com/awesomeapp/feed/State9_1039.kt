package com.awesomeapp.feed

sealed class State9_1039 {
    data object Loading : State9_1039()
    data class Success(val data: String) : State9_1039()
    data class Error(val message: String) : State9_1039()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}