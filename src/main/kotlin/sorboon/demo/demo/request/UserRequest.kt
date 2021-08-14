package sorboon.demo.demo.request

import org.springframework.data.mongodb.core.aggregation.DateOperators

class UserRequest(
    val first_name: String,
    val last_name: String,
    val email: String,
    val can_login: Boolean,
    val password: String,
    val photo: Object?,
    val locale: String,
    val timezone: String
)