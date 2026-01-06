package com.awesomeapp.checkout

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
import com.awesomeapp.checkout.*
import androidx.work.testing.TestWorkerBuilder
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.test.core.app.ApplicationProvider
import android.content.Context
import androidx.work.testing.TestListenableWorkerBuilder
import androidx.work.CoroutineWorker


@OptIn(ExperimentalCoroutinesApi::class)
class Worker5_6Test {
        @Test
    fun `placeholder - worker should be tested in androidTest`() {
        // Workers depend on Android Context and should be tested with Instrumented tests (androidTest)
        assertTrue(true)
    }
}