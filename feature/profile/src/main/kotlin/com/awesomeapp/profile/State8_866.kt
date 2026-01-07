package com.awesomeapp.profile

sealed class State8_866 {
    data object Loading : State8_866()
    data class Success(val data: String) : State8_866()
    data class Error(val message: String) : State8_866()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}