package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface GroupRepository : MongoRepository<Group, String> {
    fun findOneById(id: ObjectId): Group
    override fun deleteAll()

}