package com.awesomeapp.feed

sealed class State9_544 {
    data object Loading : State9_544()
    data class Success(val data: String) : State9_544()
    data class Error(val message: String) : State9_544()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}