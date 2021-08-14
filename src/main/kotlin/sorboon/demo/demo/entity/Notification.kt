package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Notification(
    @Id
    val id: ObjectId = ObjectId.get(),
    val created_at: LocalDateTime = LocalDateTime.now(),
    val body: String,
    val user_id: Int,
    val actor_id: ObjectId,
    val demande_id: Int,
    val sent: Boolean
)
