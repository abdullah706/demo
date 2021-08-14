package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Structures(
    @Id
    val id: ObjectId = ObjectId.get(),
    val active: Boolean,
    val type_name: String,
    val nom: String,
    val sigle: String,
    val dn: String,
    val supann_code_entite: String,
    val email: String,
    val permettre_reponse_directe: Boolean,
    val permettre_soummission_directe: Boolean
)
