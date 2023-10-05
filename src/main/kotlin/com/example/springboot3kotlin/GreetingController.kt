package com.example.springboot3kotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@ResponseBody
@RequestMapping("/greeting")
class GreetingController {
  @RequestMapping("/english", method = [RequestMethod.GET])
  fun englishGreeting(): String = "Hello World!"

  @GetMapping("/spanish")
  fun spanishGreeting(): String = "¡Hola Mundo!"
}