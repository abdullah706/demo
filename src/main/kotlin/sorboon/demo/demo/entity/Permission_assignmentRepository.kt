package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface Permission_assignmentRepository: MongoRepository<Permission_assignment, String> {
    fun findOneById(id: ObjectId): Permission_assignment
    override fun deleteAll()

}