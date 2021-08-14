package sorboon.demo.demo.entity

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Students")
class Faqq {

    @Id
    private var id: Long = 0


    private var question: String? = null


    private var answers: String? = null


    fun getQuestion(): String? {
        return question
    }

    fun setQuestion(question: String?) {
        this.question = question
    }

    fun getAnswers(): String? {
        return answers
    }

    fun setAnswers(answers: String?) {
        this.answers = answers
    }

    private val content: String? = null

    fun Faqq() {}

    fun Faqq(question: String?, answers: String?) {
        this.question = question
        this.answers = answers
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun getId(): Long {
        return id
    }


}