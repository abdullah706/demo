package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface Faq_entryRepository: MongoRepository<Faq_entry, String> {
    fun findOneById(id: ObjectId): Faq_entry
    override fun deleteAll()

}