package com.jayant.ci_cd_spring_boot_app.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/welcome")
class WelcomeController {

    @GetMapping
    fun welcome(): ResponseEntity<String> = ResponseEntity.ok("Welcome!")

   @GetMapping("/users")
   fun getUsers(): ResponseEntity<Map<String, Any>> =
        ResponseEntity.ok(mapOf("name" to "Omegamindsoftwares", "live" to true))

}
