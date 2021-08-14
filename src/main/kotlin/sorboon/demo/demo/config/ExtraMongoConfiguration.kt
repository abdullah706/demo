package sorboon.demo.demo.config
/*
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


open class ExtraMongoConfiguration {
    open val uri: String? = null
    open val database: String? = null

    /**
     * Method that creates MongoClient
     */
    private val mongoClient: MongoClient
        get() {
            return MongoClients.create(uri!!)
        }

    /**
     * Factory method to create the MongoTemplate
     */
    protected fun mongoTemplate(): MongoTemplate {
        val factory = SimpleMongoClientDatabaseFactory(mongoClient, database!!)
        return MongoTemplate(factory)
    }
}

@EnableMongoRepositories(
    basePackages = ["fr.sorbonneuniversite.labandco.files"],
    mongoTemplateRef = "externalMongoTemplate")
@Configuration
class ExternalDatabaseConfiguration : ExtraMongoConfiguration() {
    @Value("\${files.mongodb.uri:}")
    override val uri: String? = null
    @Value("\${files.mongodb.database:}")
    override val database: String? = null

    @Bean("externalMongoTemplate")
    fun externalMongoTemplate(): MongoTemplate = mongoTemplate()
}

 */