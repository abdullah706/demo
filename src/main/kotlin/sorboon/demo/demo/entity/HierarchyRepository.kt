package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface HierarchyRepository : MongoRepository<Hierarchy, String> {
    fun findOneById(id: ObjectId): Hierarchy
    override fun deleteAll()

}