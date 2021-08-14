package sorboon.demo.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller



class DeclarationInventionController {


    @GetMapping("demande_declaration_invention")
    fun demande_declaration_invention(): String {

        return "demande_declaration_invention"
    }
}