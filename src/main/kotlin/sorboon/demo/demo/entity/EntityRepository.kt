package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface EntityRepository: MongoRepository<Entity, String> {
    fun findOneById(id: ObjectId): Entity
    override fun deleteAll()

}