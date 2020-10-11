package dev.moreal.polaris.proto

import kotlinx.serialization.*

@Serializable
abstract class ControlMessage(val type: ControlMessageType)
