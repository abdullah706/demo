package sorboon.demo.demo.controllers
/*
import fr.sorbonneuniversite.labandco.entity.User
import fr.sorbonneuniversite.labandco.entity.UserRepository
import fr.sorbonneuniversite.labandco.request.UserRequest
import org.bson.types.ObjectId
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@Controller
class UserController (
    private val usersRepository: UserRepository
) {
    @GetMapping("/Users")
    fun allUsers(model: Model): String {
        val users = usersRepository.findAll()
        model["title"] = "All Users"
        model["users"] = users
        return "users"
    }

    @GetMapping("/getOneUser/{id}")
    fun getOneUser(@PathVariable("id") id: String): ResponseEntity<User> {
        val user = usersRepository.findOneById(ObjectId(id))
        return ResponseEntity.ok(user)
    }

    @PostMapping
    fun createUser(@RequestBody request: UserRequest): ResponseEntity<User> {
        val user = usersRepository.save(User(
            first_name = request.first_name,
            last_name = request.last_name,
            email = request.email,
            can_login = request.can_login,
            password = request.password,
            photo = request.photo,
            locale = request.locale,
            timezone = request.timezone,
            created_at = LocalDateTime.now()
        ))
        return ResponseEntity(user, HttpStatus.CREATED)
    }

    @PutMapping("/updateOneUser/{id}")
    fun updateUser(@RequestBody request: UserRequest, @PathVariable("id") id: String): ResponseEntity<User> {
        val user = usersRepository.findOneById(ObjectId(id))
        val updatedUser = usersRepository.save(User(
            id = user.id,
            first_name = request.first_name,
            last_name = request.last_name,
            email = request.email,
            can_login = request.can_login,
            password = request.password,
            photo = request.photo,
            locale = request.locale,
            timezone = request.timezone,
            updated_at = LocalDateTime.now()
        ))
        return ResponseEntity.ok(updatedUser)
    }

    @DeleteMapping("/deleteOneUser/{id}")
    fun deleteUser(@PathVariable("id") id: String): ResponseEntity<Unit> {
        usersRepository.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}

 */