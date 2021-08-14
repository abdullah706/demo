package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface DemandesRepository : MongoRepository<Demandes, String> {
    fun findOneById(id: ObjectId): Demandes
    override fun deleteAll()

}