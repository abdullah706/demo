package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Entity_tags(
    @Id
    val id: ObjectId = ObjectId.get(),
    val tag_id: ObjectId,
    val entity_id: ObjectId
)
