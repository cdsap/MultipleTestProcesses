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
import com.awesomeapp.identity.Api4_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository8_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository8_5(Api4_6()).getData()
        assertNotNull(result)
    }
}