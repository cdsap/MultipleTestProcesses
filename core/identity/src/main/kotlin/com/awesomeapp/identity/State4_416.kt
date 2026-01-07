package com.awesomeapp.identity

sealed class State4_416 {
    data object Loading : State4_416()
    data class Success(val data: String) : State4_416()
    data class Error(val message: String) : State4_416()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}