package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Contacts(
    @Id
    val id: ObjectId = ObjectId.get(),
    val user_id: ObjectId,
    val structure_id: ObjectId,
    val contact_type_name: String
)
