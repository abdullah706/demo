import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import sorboon.demo.demo.controllers.Question
import sorboon.demo.demo.controllers.QuestionsTheme
import java.util.*

@Controller
class FaqController {
    @GetMapping("/faq")
    fun greeting(model: Model): String? {
        val questions1 = Arrays.asList(
            Question(
                "L'accord de consortium doit-il être signé en même temps que le contrat ?",
                "Réponse"
            ),
            Question("Quels sont les types de contrat à justitifier ?", "Réponse")
        )
        val questions2 = Arrays.asList(
            Question("Que devient l'argent qui reste à la fin du projet ?", "Réponse"),
            Question(
                "Qu'arrive-t-il en cas de déficit budgétaire sur une convention ?",
                "Réponse"
            )
        )
        val questionsThemes = Arrays.asList(
            QuestionsTheme(questions1, "Conventions de recherche"),
            QuestionsTheme(questions2, "Gestion financière")
        )
        model.addAttribute("questionsThemes", questionsThemes)
        return "faq"

    }

    @GetMapping("/contact")
    fun contact(model: Model): String? {
        class Contact(var type: String, var link: String, var mail: String, var phone: String, var fullName: String)
        model.addAttribute("laboratoire", "INSTITUT DE LA VISION")
        model.addAttribute(
            "contacts", Arrays.asList(
                Contact(
                    "Contact Entreprises", "#",
                    "dupont.eric@monmail.com", "01 48 99 88 77", "Dupont Eric"
                )
            )
        )
        return "contact"
    }
}