package com.example.springboot3kotlin

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.server.ResponseStatusException

@Controller
@ResponseBody
@RequestMapping("/greeting")
class GreetingController(private val greetingService: GreetingService) {
  @GetMapping("/{languageKey}")
  fun getGreeting(@PathVariable languageKey: String): String =
    greetingService.getGreeting(languageKey)
      ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "No greeting found for $languageKey")
}
