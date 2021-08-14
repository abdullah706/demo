package sorboon.demo.demo.entity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {
    fun findOneById(id: ObjectId): User
    override fun deleteAll()

}