package sorboon.demo.demo.entity

import sorboon.demo.demo.entity.Entity_type
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Entity(
    @Id
    val id: ObjectId = ObjectId.get(),
    val created_at: LocalDateTime = LocalDateTime.now(),
    val updated_at: LocalDateTime = LocalDateTime.now(),
    val deleted_at: LocalDateTime = LocalDateTime.now(),
    val name: String,
    val slug: String,
    val entity_type : Entity_type,
    val meta: String,
    val creator_id: ObjectId,
    val owner_id: ObjectId
)
