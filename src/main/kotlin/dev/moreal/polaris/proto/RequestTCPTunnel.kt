package dev.moreal.polaris.proto

import kotlinx.serialization.*

@Serializable
data class RequestTCPTunnel(val hostname: String, val port: Int, val auth: String) {}
