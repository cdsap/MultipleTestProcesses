package com.awesomeapp.profile

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
import com.awesomeapp.profile.*


@OptIn(ExperimentalCoroutinesApi::class)
class State8_233Test {
        @Test
    fun `test loading state`() {
        val state = State8_233.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State8_233.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State8_233.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State8_233.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State8_233.Error).message)
    }
}