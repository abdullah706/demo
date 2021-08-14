package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Hierarchy(
    @Id
    val id: ObjectId = ObjectId.get(),
    val parent_id: ObjectId,
    val child_id: ObjectId
)
