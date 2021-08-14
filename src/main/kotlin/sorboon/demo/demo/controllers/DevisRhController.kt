package sorboon.demo.demo.controllers


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller


class DevisRhController {

    @GetMapping("devis_rh")
    fun devis_rh(): String {

        return "devis_rh"
    }
}