package sorboon.demo.demo.controllers



import java.io.Serializable
import java.time.LocalDateTime


class Jours : Serializable {

    var days: String? = null
    var numday: Int? = null





    constructor() {}
    constructor(numday: Int?, days: String?,) {
        this.numday = numday
        this.days = days

    }

    override fun toString(): String {
        return "Project{" +
                " numday=" + numday +
                ", days=" + days +

                '}'
    }
}
