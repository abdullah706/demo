package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Permission_assignment(
    @Id
    val id: ObjectId = ObjectId.get(),
    val permission: String,
    val role: String,
    val object_id: ObjectId
)
