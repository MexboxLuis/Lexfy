package com.example.lexfy.utils

fun normalizeText(input: String): String {
    return try {
        input.split(" ")
            .joinToString(" ") { it.replaceFirstChar { char -> char.uppercaseChar() } }
    } catch (e: Exception) {
        "New Chat"
    }
}
