package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.aggregation.DateOperators
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class User(
    @Id
    val id: ObjectId = ObjectId.get(),
    val created_at: LocalDateTime = LocalDateTime.now(),
    val updated_at:LocalDateTime = LocalDateTime.now(),
    val deleted_at:LocalDateTime = LocalDateTime.now(),
    val first_name: String,
    val last_name: String,
    val email: String,
    val can_login: Boolean,
    val password: String,
    val photo: Object?,
    val last_active: LocalDateTime? = LocalDateTime.now(),
    val locale: String,
    val timezone: String
)
