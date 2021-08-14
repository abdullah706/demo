package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Timestamp

@Document
data class Profile(
    @Id
    val id: ObjectId = ObjectId.get(),
    val uid: String,
    val active: Boolean,
    val nom: String,
    val prenom: String,
    val email: String,
    val adresse: String,
    val telephone: String,
    val laboratoire_id: ObjectId,
    val gouvernance: Boolean,
    val gouvernance_vraiment: Boolean,
    val dgrtt: Boolean,
    val chef_du_bureau: String,
    val fonction_structurelle_principale: String,
    val idap_entry: String,
    val cas_entry: String,
    val date_derniere_natification_vue: Timestamp,
    val date_last_login: Timestamp,
    val preferences_notifications: Int,
    val preferences_nb_jours_notifications: Int
)
