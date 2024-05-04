package dev.shreyaspatil.ai.client.generativeai.type

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalEncodingApi::class)
open class PlatformImage(val data: ByteArray) {
    open fun asBase64(): String {
        return Base64.encode(data)
    }
}

typealias Bitmap = PlatformImage