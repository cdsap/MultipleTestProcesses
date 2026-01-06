package com.awesomeapp.message

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
import com.awesomeapp.message.*
import kotlinx.coroutines.flow.first


@OptIn(ExperimentalCoroutinesApi::class)
class Usecase18_5Test {
        private lateinit var useCase: Usecase18_5

    @Before
    fun setup() {
        useCase = Usecase18_5()
    }

    @Test
    fun `test invoke returns data`() = runTest {
        val result = useCase().first()
        assertEquals("Data from Usecase18_5 UseCase", result)
    }
}