package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Role(
    @Id
    val id: ObjectId = ObjectId.get(),
    val type: Role_type,
    val profile_id: ObjectId,
    val context_id: ObjectId
)
