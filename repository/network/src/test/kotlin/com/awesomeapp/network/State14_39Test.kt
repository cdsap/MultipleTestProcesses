package com.awesomeapp.network

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Rule
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import kotlin.test.assertTrue
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import com.awesomeapp.network.*


@OptIn(ExperimentalCoroutinesApi::class)
class State14_39Test {
        @Test
    fun `test loading state`() {
        val state = State14_39.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State14_39.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State14_39.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State14_39.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State14_39.Error).message)
    }
}