package sorboon.demo.demo.controllers




import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller

class ConventionRechercheController {

    @GetMapping("demande_convention_recherche")
    fun demande_convention_recherche(): String {

        return "demande_convention_recherche"
    }

}