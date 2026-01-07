package com.awesomeapp.app

sealed class State20_760 {
    data object Loading : State20_760()
    data class Success(val data: String) : State20_760()
    data class Error(val message: String) : State20_760()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}