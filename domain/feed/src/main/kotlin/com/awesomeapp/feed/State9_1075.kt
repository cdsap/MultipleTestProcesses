package com.awesomeapp.feed

sealed class State9_1075 {
    data object Loading : State9_1075()
    data class Success(val data: String) : State9_1075()
    data class Error(val message: String) : State9_1075()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}