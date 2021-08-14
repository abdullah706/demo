package sorboon.demo.demo.Repositroy

import sorboon.demo.demo.entity.Faqq


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import sorboon.demo.demo.files.File


interface FaqqRepository : MongoRepository<Faqq, Long> {

    fun findByQuestion(question: String?): List<Faqq?>?
}