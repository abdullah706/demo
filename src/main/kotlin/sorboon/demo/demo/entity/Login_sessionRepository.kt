package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface Login_sessionRepository: MongoRepository<Login_session, String> {
    fun findOneById(id: ObjectId): Login_session
    override fun deleteAll()

}