import com.github.kittinunf.fuel.Fuel
import dbmodels.Books
import models.Person
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {
    val url = "https://next.json-generator.com/api/json/get/EkCmEaBtB"

    Fuel.get(url).responseObject(Person.PersonArrayDeserializer()) { request, response, result ->
        val (persons, err) = result
        persons?.forEach { println(it) }
    }

    Database.connect(
            "jdbc:postgresql:misctests",
            "org.postgresql.Driver",
            "postgres",
            "postgres"
    )

    transaction {
        SchemaUtils.create(Books)

        Books.insert {
            it[title] = "El algebra de baldor 2"
        }

        Books.insert {
            it[title] = "Trigonometria analitica de Swokowsky 2"
        }

        Books.insert {
            it[title] = "Barbuchin 2"
        }

        println("Estos son los libros:")
        for (book in Books.selectAll()) {
            println("${book[Books.id]}: ${book[Books.title]}")
        }
    }

    Thread.sleep(5000)

}




//        Users.insert {
//            it[firstName] = "Samuel"
//            it[lastName] = "Chavez"
//        }
//
//        Users.insert {
//            it[firstName] = "Cesar"
//            it[lastName] = "Chavez"
//        }
//        drop(Users)