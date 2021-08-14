package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface FollowingRepository : MongoRepository<Following, String> {
    fun findOneById(id: ObjectId): Following
    override fun deleteAll()

}