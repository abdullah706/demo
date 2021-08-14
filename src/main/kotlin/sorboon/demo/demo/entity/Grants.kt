package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Grants(
    @Id
    val id: ObjectId = ObjectId.get(),
    val user_id: ObjectId,
    val role_name: String,
    val context_id: ObjectId
)
