package com.example.springboot3kotlin

import org.springframework.stereotype.Service

@Service
class GreetingService {

  val greetings =
    mapOf(
      "en" to "Hello World!",
      "es" to "¡Hola Mundo!",
      "hi" to "हैलो वर्ल्ड!",
      "fr" to "Bonjour le monde!",
      "zh" to "你好世界！",
    )

  fun getGreeting(languageKey: String): String? = greetings[languageKey]
}
