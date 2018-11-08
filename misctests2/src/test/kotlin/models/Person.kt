package models

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

data class Person(val firstName: String, val lastName: String, val age: Int, val isHealthy: Boolean) {
    class PersonArrayDeserializer: ResponseDeserializable<Array<Person>> {
        override fun deserialize(content: String): Array<Person>? {
            return Gson().fromJson(content, Array<Person>::class.java)
        }
    }
}