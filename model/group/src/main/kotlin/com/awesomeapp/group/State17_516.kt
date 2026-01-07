package com.awesomeapp.group

sealed class State17_516 {
    data object Loading : State17_516()
    data class Success(val data: String) : State17_516()
    data class Error(val message: String) : State17_516()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}