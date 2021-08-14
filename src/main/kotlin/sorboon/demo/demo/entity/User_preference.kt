package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User_preference(
    @Id
    val id: ObjectId = ObjectId.get(),
    val user_id: ObjectId,
    val key: String,
    val value: String
)
