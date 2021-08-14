package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface AdministratorshipRepository : MongoRepository<Administratorship, String> {
    fun findOneById(id: ObjectId): Administratorship
    override fun deleteAll()
}