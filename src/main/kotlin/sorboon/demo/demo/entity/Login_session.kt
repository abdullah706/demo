package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Login_session(
    @Id
    val id: ObjectId = ObjectId.get(),
    val started_at: LocalDateTime = LocalDateTime.now(),
    val last_active_at: LocalDateTime = LocalDateTime.now(),
    val ended_at: LocalDateTime?,
    val user_id: ObjectId,
    val ip_address: String,
    val user_agent: String
)
