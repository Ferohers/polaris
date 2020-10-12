package dev.moreal.polaris.proto

import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.lang.IllegalArgumentException

object ControlMessageSerializer : JsonContentPolymorphicSerializer<ControlMessage>(ControlMessage::class) {
    override fun selectDeserializer(element: JsonElement) = when (element.jsonObject.getValue("type").jsonPrimitive.toString()) {
        ControlMessageType.RequestTCPTunnel.name -> RequestTCPTunnel.serializer()
        ControlMessageType.ResponseTCPTunnel.name -> ResponseTCPTunnel.serializer()
        ControlMessageType.NewProxy.name -> NewProxy.serializer()
        else -> throw IllegalArgumentException()
    }
}
