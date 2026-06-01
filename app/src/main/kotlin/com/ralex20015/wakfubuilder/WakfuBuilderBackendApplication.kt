package com.ralex20015.wakfubuilder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class WakfuBuilderBackendApplication

fun main(args: Array<String>) {
    runApplication<WakfuBuilderBackendApplication>(*args)
}