package com.awesomeapp.identity

sealed class State4_881 {
    data object Loading : State4_881()
    data class Success(val data: String) : State4_881()
    data class Error(val message: String) : State4_881()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}