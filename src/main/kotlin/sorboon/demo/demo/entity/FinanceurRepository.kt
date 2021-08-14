package sorboon.demo.demo.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface FinanceurRepository : MongoRepository<Financeur, String> {
    fun findOneById(id: ObjectId): Financeur
    override fun deleteAll()

}