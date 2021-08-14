package sorboon.demo.demo.controllers


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller

<<<<<<< 01173a367d49892b4d9f3e165c51daad53ff53b2
class HolleWorld {
=======
class olleWorld {
>>>>>>> Initial commit

    @GetMapping("/")
    fun index(): String {
        return "index"
    }



}




