package com.jaehong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveFeignApplication

fun main(args: Array<String>) {
    runApplication<ReactiveFeignApplication>(*args)
}
