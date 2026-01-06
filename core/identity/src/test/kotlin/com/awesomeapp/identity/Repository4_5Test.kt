package com.awesomeapp.identity

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
import com.awesomeapp.identity.*


@OptIn(ExperimentalCoroutinesApi::class)
class Repository4_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository4_5().getData()
        assertNotNull(result)
    }
}