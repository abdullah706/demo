package sorboon.demo.demo.controllers



import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class OngletsController {



    @GetMapping("demande_onglets")
    fun demande_onglets(): String {

        return "demande_onglets"
    }
}






