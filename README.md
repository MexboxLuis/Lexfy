# Welcome to Lexfy 📸✨

[![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=flat-square&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=flat-square&logo=android&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Python](https://img.shields.io/badge/Python-14354C?style=flat-square&logo=python&logoColor=white)](https://www.python.org/)
[![Firebase](https://img.shields.io/badge/Firebase-FFCA28?style=flat-square&logo=firebase&logoColor=black)](https://firebase.google.com/)

Welcome to the **Lexfy** repository. This is a native Android application that integrates Optical Character Recognition (OCR) and AI-powered image generation into a cohesive platform. It allows users to extract text from physical documents using advanced machine learning models and generate new visual content through a conversational chat interface.

---

## 📚 About The Project

| Feature                | Details |
| ---------------------- | ------- |
| 🎯 **Purpose**         | A centralized tool for precise text extraction from images and AI-driven image generation. |
| ⚙️ **Architecture**     | Client-Server architecture. The Android client communicates via HTTP with a local Python/Flask backend hosting the AI models. |
| 💾 **Data Management** | User authentication, document storage, and chat history synchronization are securely handled via Firebase. |
| 🔄 **Core Operations** | Capture/upload photos for OCR, edit extracted text, prompt image generation, and manage personal document libraries. |

---

## 🚀 Tech Stack

### Android & UI

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=android&logoColor=white)

- **Kotlin & Jetpack Compose:** UI built declaratively with modern navigation and state handling.
- **CameraX:** Used for capturing images directly from the app.
- **OkHttp:** Handles HTTP communication with backend services.

### Backend & AI Models

![Flask](https://img.shields.io/badge/Flask-000000?style=for-the-badge&logo=flask&logoColor=white)

- **Python & Flask:** Backend server (`finalApp.py`) processes images and prompts.
- **OCR Models:** EasyOCR and GOT-OCR2_0 for text extraction.
- **Image Generation:** Together API using FLUX.1-schnell.

### Cloud Integration

- **Firebase Authentication**
- **Firebase Firestore & Storage**

---

## 🔧 Highlighted Features

| Feature | Description |
|--------|------------|
| **Multi-Model OCR** | Choose between EasyOCR and GOT-OCR2_0. |
| **AI Image Generator** | Chat-based image generation. |
| **Document Management** | Store, edit, and delete OCR results. |
| **Smart Chat History** | Organized by time periods. |

---

## 📸 Screenshots

- ![Welcome & Login](assets/WelcomeLogin.jpeg)
- ![OCR Scanner](assets/OCRScanner.jpeg)
- ![Dashboard](assets/HomeDashboard.jpeg)
- ![Generator](assets/ImageGenerator.jpeg)

---

## 🛠️ How to Run Locally

### 1. Backend Setup

```bash
git clone https://github.com/MexboxLuis/Lexfy.git
cd Lexfy/app/src/main/java/com/example/yoloapp/ui/model
```

```bash
pip install flask transformers together easyocr
```

Update API key in `config.py`.

```bash
python finalApp.py
```

---

### 2. Android Setup

- Open in Android Studio
- Add Firebase config
- Run emulator

---

## 💡 Final Notes

This project demonstrates integration of OCR + generative AI inside a mobile app.
