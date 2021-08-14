package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface User_preferenceRepository : MongoRepository<User_preference, String> {
    fun findOneById(id: ObjectId): User_preference
    override fun deleteAll()

}