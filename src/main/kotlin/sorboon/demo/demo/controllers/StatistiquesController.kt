package sorboon.demo.demo.controllers


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller


class StatistiquesController {
    @GetMapping("statistiques")
    fun statistiques(): String {

        return "statistiques"
    }
}