package sorboon.demo.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller



@Suppress("SpellCheckingInspection")
class AvenantConventionController {


    @GetMapping("demande_avenant_convention")
    fun demande_avenant_convention(): String {

        return "demande_avenant_convention"
    }
}