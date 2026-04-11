package com.example.lexfy.utils

import com.example.lexfy.data.DocumentData

suspend fun updateDocumentText(
    document: DocumentData,
    newText: String,
    firestoreManager: FireStoreManager,
    onDocumentUpdated: (DocumentData) -> Unit
) {
    firestoreManager.updateDocumentText(document.documentId, newText)

    onDocumentUpdated(document.copy(text = newText))
}


suspend fun deleteDocument(
    document: DocumentData,
    firestoreManager: FireStoreManager,
    onDocumentDeleted: (String) -> Unit
) {
    firestoreManager.deleteDocument(document.documentId, document.imageUrl)
    onDocumentDeleted(document.documentId)
}
