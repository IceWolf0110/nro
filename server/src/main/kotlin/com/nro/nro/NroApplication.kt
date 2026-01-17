package com.nro.nro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NroApplication

fun main(args: Array<String>) {
    runApplication<NroApplication>(*args)
}
