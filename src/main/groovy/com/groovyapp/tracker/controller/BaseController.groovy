package com.groovyapp.tracker.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/app")
abstract class BaseController {

    @GetMapping("/hello")
    def hello() {
        "Hello from Groovy Spring Boot!"
    }
}
