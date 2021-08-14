package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RoleassignmentRepository : MongoRepository<Roleassignment, String> {
    fun findOneById(id: ObjectId): Roleassignment
    override fun deleteAll()

}