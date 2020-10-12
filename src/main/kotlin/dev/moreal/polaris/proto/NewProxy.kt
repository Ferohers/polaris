package dev.moreal.polaris.proto

import kotlinx.serialization.Serializable

@Serializable
data class NewProxy(val identifier: String) : ControlMessage(ControlMessageType.NewProxy)
