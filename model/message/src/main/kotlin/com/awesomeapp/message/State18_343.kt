package com.awesomeapp.message

sealed class State18_343 {
    data object Loading : State18_343()
    data class Success(val data: String) : State18_343()
    data class Error(val message: String) : State18_343()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}