package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface MembershipRepository : MongoRepository<Membership, String> {
    fun findOneById(id: ObjectId): Membership
    override fun deleteAll()
}