package com.awesomeapp.push

sealed class State1_393 {
    data object Loading : State1_393()
    data class Success(val data: String) : State1_393()
    data class Error(val message: String) : State1_393()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}