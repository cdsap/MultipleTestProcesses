package com.awesomeapp.feed

sealed class State9_979 {
    data object Loading : State9_979()
    data class Success(val data: String) : State9_979()
    data class Error(val message: String) : State9_979()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}