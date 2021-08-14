package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface ProfileRepository : MongoRepository<Profile, String> {
    fun findOneById(id: ObjectId): Profile
    override fun deleteAll()

}