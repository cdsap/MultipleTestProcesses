package com.awesomeapp.location

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
import com.awesomeapp.location.*


@OptIn(ExperimentalCoroutinesApi::class)
class State13_291Test {
        @Test
    fun `test loading state`() {
        val state = State13_291.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State13_291.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State13_291.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State13_291.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State13_291.Error).message)
    }
}