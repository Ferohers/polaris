package dev.moreal.polaris.proto

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class ResponseTCPTunnelTest(
    private val resultCode: ResultCode,
    private val expected: String
) {
    @Test
    fun serialize() {
        val encoded = Json.encodeToString(
            ResponseTCPTunnel(
                hostname = "localhost",
                port = 25565,
                resultCode = resultCode,
            )
        )
        assertEquals(expected, encoded)
    }

    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun testcases() = listOf(
            arrayOf<Any>(
                ResultCode.SUCCESS,
                """{"type":"ResponseTCPTunnel","hostname":"localhost","port":25565,"resultCode":"SUCCESS"}"""
            ),
            arrayOf<Any>(
                ResultCode.INVALID_AUTHENTICATION,
                """{"type":"ResponseTCPTunnel","hostname":"localhost","port":25565,"resultCode":"INVALID_AUTHENTICATION"}"""
            ),
        )
    }
}
