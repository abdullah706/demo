package sorboon.demo.demo.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import sorboon.demo.demo.Repositroy.FaqqRepository
import sorboon.demo.demo.entity.Faqq


@Controller
@RequestMapping("/students/")
class FaqqController {
    private val FaqqRepository: FaqqRepository? = null

    @Autowired
    fun FaqqController(FaqqRepository: FaqqRepository?) {
        this.FaqqRepository = FaqqRepository
    }

    @GetMapping("signup")
    fun showSignUpForm(Faqq: Faqq?): String? {
        return "add-faqq"
    }

    @GetMapping("list")
    fun showUpdateForm(model: Model): String? {
        model.addAttribute("students", FaqqRepository!!.findAll())
        return "index"
    }

    @PostMapping("add")
    fun addFaqq(faqq: Faqq, result: BindingResult, model: Model?): String? {
        if (result.hasErrors()) {
            return "add-faqq"
        }
        FaqqRepository!!.save(faqq)
        return "redirect:list"
    }

    @GetMapping("edit/{id}")
    fun showUpdateForm(@PathVariable("id") id: Long, model: Model): String? {
        val faqq = FaqqRepository!!.findById(id)
            .orElseThrow {
                IllegalArgumentException(
                    "Invalid faqq Id:$id"
                )
            }
        model.addAttribute("faqq", faqq)
        return "update-student"
    }

    @PostMapping("update/{id}")
    fun updateFaqq(
        @PathVariable("id") id: Long, faqq: Faqq, result: BindingResult,
        model: Model
    ): String? {
        if (result.hasErrors()) {
            faqq.setId(id)
            return "update-faqq"
        }
        FaqqRepository!!.save(faqq)
        model.addAttribute("students", FaqqRepository.findAll())
        return "index"
    }

    @GetMapping("delete/{id}")
    fun deleteFaqq(@PathVariable("id") id: Long, model: Model): String? {
        val faqq = FaqqRepository!!.findById(id)
            .orElseThrow {
                IllegalArgumentException(
                    "Invalid student Id:$id"
                )
            }
        FaqqRepository.delete(faqq)
        model.addAttribute("students", FaqqRepository.findAll())
        return "index"
    }
}