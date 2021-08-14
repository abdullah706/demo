package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.w3c.dom.Text
import java.sql.Date
import java.sql.Timestamp
import java.time.LocalDateTime

@Document
data class Demandes(
    @Id
    val id: ObjectId = ObjectId.get(),
    val type: Demandes_type,
    val created_at: LocalDateTime = LocalDateTime.now(),
    val updated_at: LocalDateTime = LocalDateTime.now(),
    val nom: String,
    val name: String,
    val active: Boolean,
    val editable: Boolean,
    val no_infolab: String,
    val no_eotp: String,
    val contact_labco_id: String,
    val gestionnaire_id: String,
    val porteur_id: String,
    val structure_id: ObjectId,
    val data: Text,
    val past_versions: Text,
    val form_state: Text,
    val attachments: Text,
    val feuille_cout: Text,
    val documents_generes: Text,
    val wf_state: String,
    val wf_date_derniere_action: Timestamp,
    val wf_reard: Int,
    val wf_history: Text,
    val wf_data: Text,
    val data_effective: Date
)
