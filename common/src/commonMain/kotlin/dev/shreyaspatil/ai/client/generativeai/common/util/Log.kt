package dev.shreyaspatil.ai.client.generativeai.common.util

expect object Log {
    fun w(tag: String, message: String)
    fun e(tag: String, message: String, throwable: Throwable? = null)
}