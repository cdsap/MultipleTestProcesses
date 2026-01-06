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
class Api8_6Test {
        private lateinit var api: Api8_6

    @Before
    fun setup() {
        api = Api8_6()
    }

    @Test
    fun `test fetchData returns data`() = runTest {
        val result = api.fetchData()
        assertNotNull(result)
    }
}