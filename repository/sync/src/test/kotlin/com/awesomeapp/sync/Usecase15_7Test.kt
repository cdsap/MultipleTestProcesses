package com.awesomeapp.sync

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
import com.awesomeapp.sync.*
import kotlinx.coroutines.flow.first


@OptIn(ExperimentalCoroutinesApi::class)
class Usecase15_7Test {
        private lateinit var useCase: Usecase15_7

    @Before
    fun setup() {
        useCase = Usecase15_7()
    }

    @Test
    fun `test invoke returns data`() = runTest {
        val result = useCase().first()
        assertEquals("Data from Usecase15_7 UseCase", result)
    }
}