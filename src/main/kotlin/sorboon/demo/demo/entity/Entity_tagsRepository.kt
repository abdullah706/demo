package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface Entity_tagsRepository: MongoRepository<Entity_tags, String> {
    fun findOneById(id: ObjectId): Entity_tags
    override fun deleteAll()
}