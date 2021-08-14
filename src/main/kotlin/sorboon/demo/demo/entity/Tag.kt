package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Tag(
    @Id
    val id: ObjectId = ObjectId.get(),
    val ns: String,
    val label: String
)
