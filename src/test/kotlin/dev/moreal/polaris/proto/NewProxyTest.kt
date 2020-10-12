package dev.moreal.polaris.proto

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class NewProxyTest {
    @Test
    fun serialize() {
        val encoded = Json.encodeToString(
            NewProxy(
                identifier = "PROXY_IDENTIFIER"
            )
        )
        val expected = """{"type":"NewProxy","identifier":"PROXY_IDENTIFIER"}"""
        assertEquals(expected, encoded)
    }
}
