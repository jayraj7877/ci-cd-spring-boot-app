package com.jayant.ci_cd_spring_boot_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootAppApplication

fun main(args: Array<String>) {
	runApplication<SpringBootAppApplication>(*args)
}
