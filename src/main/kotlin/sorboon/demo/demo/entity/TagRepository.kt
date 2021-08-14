package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface TagRepository : MongoRepository<Tag, String> {
    fun findOneById(id: ObjectId): Tag
    override fun deleteAll()

}