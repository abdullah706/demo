package sorboon.demo.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller



class StructureOngletsController {

    @GetMapping("structure_onglets")
    fun structure_onglets(): String {

        return "structure_onglets"
    }



}