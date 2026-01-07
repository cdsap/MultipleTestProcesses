package com.awesomeapp.push

sealed class State1_357 {
    data object Loading : State1_357()
    data class Success(val data: String) : State1_357()
    data class Error(val message: String) : State1_357()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}