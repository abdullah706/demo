package sorboon.demo.demo.controllers


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller

class HolleWorld {

    @GetMapping("/")
    fun index(): String {
        return "index"
    }



}




