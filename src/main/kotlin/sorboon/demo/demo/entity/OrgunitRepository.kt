package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface OrgunitRepository : MongoRepository<Orgunit, String> {
    fun findOneById(id: ObjectId): Orgunit
    override fun deleteAll()

}