package sorboon.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SorboonApplication

fun main(args: Array<String>) {
	runApplication<SorboonApplication>(*args)
}
