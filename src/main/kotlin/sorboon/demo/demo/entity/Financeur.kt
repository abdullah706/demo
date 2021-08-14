package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Financeur(
    @Id
    val id: ObjectId = ObjectId.get(),
    val nom: String,
    val sigle: String,
    val type: String,
    val sous_type: String,
    val classe: String,
    val pays: String
)
