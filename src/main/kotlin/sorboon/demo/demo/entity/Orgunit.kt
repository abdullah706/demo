package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Orgunit(
    @Id
    val id: ObjectId = ObjectId.get(),
    val type: Orgunit_type,
    val dn: String,
    val nom: String,
    val sigle: String,
    val parent_id: ObjectId,
    val wf_settings: String,
    val permettre_reponse_directe: Boolean,
    val permettre_soummission_directe: Boolean
)
