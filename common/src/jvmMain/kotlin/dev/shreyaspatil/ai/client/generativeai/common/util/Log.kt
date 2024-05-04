package dev.shreyaspatil.ai.client.generativeai.common.util

import org.slf4j.LoggerFactory

actual object Log {
    private val logger = LoggerFactory.getLogger("GenerativeAI")

    actual fun w(tag: String, message: String) {
        logger.warn("[$tag] $message")
    }

    actual fun e(tag: String, message: String, throwable: Throwable?) {
        logger.error("[$tag] $message", throwable)
    }
}
