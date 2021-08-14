package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface StructuresRepository : MongoRepository<Structures, String> {
    fun findOneById(id: ObjectId): Structures
    override fun deleteAll()

}