package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RoleRepository : MongoRepository<Role, String> {
    fun findOneById(id: ObjectId): Role
    override fun deleteAll()

}