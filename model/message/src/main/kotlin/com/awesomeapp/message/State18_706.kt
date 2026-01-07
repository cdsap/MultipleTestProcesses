package com.awesomeapp.message

sealed class State18_706 {
    data object Loading : State18_706()
    data class Success(val data: String) : State18_706()
    data class Error(val message: String) : State18_706()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}