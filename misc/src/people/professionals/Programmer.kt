package people.professionals

import people.Person

class Programmer: Person {
    var language: String
    constructor(_name: String, _age: Int, _language: String): super(_name, _age) {
        language = _language
    }

    override fun toString(): String {
        return "${super.toString()}\nlanguage: ${language}"
    }
}
