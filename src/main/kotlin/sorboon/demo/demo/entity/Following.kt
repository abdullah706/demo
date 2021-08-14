package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Following(
    @Id
    val id: ObjectId = ObjectId.get(),
    val follower_id: ObjectId,
    val followee_id: ObjectId
)
