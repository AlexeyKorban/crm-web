package ru.ldwx.crmweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrmWebApplication

fun main(args: Array<String>) {
	runApplication<CrmWebApplication>(*args)
}
