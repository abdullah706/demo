package sorboon.demo.demo.files

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.MongoRepository

@Document(collection = "File")
data class File(
    @Id
    val id: String? = null,
    val sku: String,
    val price: Double
)

interface FileRepository : MongoRepository<File, String>