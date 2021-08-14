package sorboon.demo.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping


@Controller

class PreferencesController {
    @GetMapping("/Preferences")
    fun main(model: Model): String? {
        model.addAttribute("jour", Jours())
        return "Preferences"
    }

    @PostMapping("/save-time")
    fun saveProjectSubmission(@ModelAttribute jour: Jours?): String? {

        // TODO: save project in DB here
        return "result"
    }

}