package dev.moreal.polaris.proto

import kotlinx.serialization.Serializable

@Serializable
enum class ResultCode {
    SUCCESS,
    INVALID_AUTHENTICATION,
}
