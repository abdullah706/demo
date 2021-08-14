package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Group(
    @Id
    val id : ObjectId = ObjectId.get(),
    val created_at: LocalDateTime = LocalDateTime.now(),
    val updated_at: LocalDateTime = LocalDateTime.now(),
    val deleted_at: LocalDateTime = LocalDateTime.now(),
    val name : String,
    val description : String,
    val photo: Object?,
    val public: Boolean
)
