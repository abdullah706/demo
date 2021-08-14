package sorboon.demo.demo.config

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.mongodb.MongoDatabaseFactory
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
/*
@Configuration
@EnableMongoRepositories(basePackages = ["fr.sorbonneuniversite.labandco.entity"])
@Import(value = [MongoAutoConfiguration::class])
class CoreMongoConfiguration {
    @Bean
    fun mongoTemplate(mongoDbFactory: MongoDatabaseFactory): MongoTemplate {
        return MongoTemplate(mongoDbFactory)
    }
}


 */