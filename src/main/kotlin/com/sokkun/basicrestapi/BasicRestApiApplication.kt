package com.sokkun.basicrestapi

import com.datical.liquibase.ext.config.LiquibaseProConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableConfigurationProperties(LiquibaseProperties::class)
class BasicRestApiApplication

fun main(args: Array<String>) {
	runApplication<BasicRestApiApplication>(*args)
}
