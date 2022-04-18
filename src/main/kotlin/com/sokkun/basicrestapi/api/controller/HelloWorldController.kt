package com.sokkun.basicrestapi.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class HelloWorldController {

    @GetMapping("/hello")
    fun helloWorld(): String = "Hello, This is a first starting with rest api"
}