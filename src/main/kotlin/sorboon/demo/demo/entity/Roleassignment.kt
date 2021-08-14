package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Roleassignment(
    @Id
    val id: ObjectId = ObjectId.get(),
    val role: String,
    val anonymous: Boolean,
    val user_id: ObjectId,
    val group_id: ObjectId,
    val object_id: ObjectId
)
