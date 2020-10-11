package dev.moreal.polaris.proto

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class RequestTCPTunnelTest {
    @Test
    fun serialize() {
        val encoded = Json.encodeToString(
            RequestTCPTunnel(
                hostname = "localhost",
                port = 25565,
                auth = "AUTH_TOKEN",
            )
        )
        val expected = """{"type":"RequestTCPTunnel","hostname":"localhost","port":25565,"auth":"AUTH_TOKEN"}"""
        assertEquals(expected, encoded)
    }
}
