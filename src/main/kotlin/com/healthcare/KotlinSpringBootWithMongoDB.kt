package com.healthcare

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSpringBootWithMongoDB

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringBootWithMongoDB::class.java, *args)
}