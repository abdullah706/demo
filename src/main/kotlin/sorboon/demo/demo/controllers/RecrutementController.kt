package sorboon.demo.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller


class RecrutementController {

    @GetMapping("demande_recrutement")
    fun demande_recrutement(): String {

        return "demande_recrutement"
    }
}