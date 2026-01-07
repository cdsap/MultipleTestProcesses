package com.awesomeapp.identity

sealed class State4_1184 {
    data object Loading : State4_1184()
    data class Success(val data: String) : State4_1184()
    data class Error(val message: String) : State4_1184()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}