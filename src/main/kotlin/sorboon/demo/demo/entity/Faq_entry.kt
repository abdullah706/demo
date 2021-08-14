package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Faq_entry(
    @Id
    val id: ObjectId = ObjectId.get(),
    val title: String,
    val category: String,
    val body: String,
    val view_count: Int
)
