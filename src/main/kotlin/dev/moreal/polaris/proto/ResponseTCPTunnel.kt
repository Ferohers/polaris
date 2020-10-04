package dev.moreal.polaris.proto

import kotlinx.serialization.Serializable

@Serializable
data class ResponseTCPTunnel(val hostname: String, val port: Int, val resultCode: ResultCode) {}
