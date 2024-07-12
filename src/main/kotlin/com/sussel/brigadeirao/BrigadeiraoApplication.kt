package com.sussel.brigadeirao

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrigadeiraoApplication

fun main(args: Array<String>) {
	runApplication<BrigadeiraoApplication>(*args)
	println("\nAPI started with success!")
}
