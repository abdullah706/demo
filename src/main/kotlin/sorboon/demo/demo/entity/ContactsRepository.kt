package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface ContactsRepository : MongoRepository<Contacts, String> {
    fun findOneById(id: ObjectId): Contacts
    override fun deleteAll()

}