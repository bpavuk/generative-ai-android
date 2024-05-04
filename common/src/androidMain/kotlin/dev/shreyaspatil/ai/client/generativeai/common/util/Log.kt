package dev.shreyaspatil.ai.client.generativeai.common.util

actual object Log {
    actual fun w(tag: String, message: String) {
        android.util.Log.w(tag, message)
    }
    actual fun e(tag: String, message: String, throwable: Throwable?) {
        android.util.Log.e(tag, message, throwable)
    }
}