package com.healthcare.claims.KotlinSpringBootWithMongoDB

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootWithMongoDbApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootWithMongoDbApplication>(*args)
}
