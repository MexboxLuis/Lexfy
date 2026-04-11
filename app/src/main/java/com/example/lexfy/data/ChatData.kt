package com.example.lexfy.data

import com.example.lexfy.ui.model.ChatMessage
import com.google.firebase.Timestamp


data class ChatData(
    val email: String = "",
    val title: String = "",
    val createdAt: Timestamp = Timestamp.now(),
    val lastModifiedAt: Timestamp = Timestamp.now(),
    val messages: List<ChatMessage> = emptyList()
)