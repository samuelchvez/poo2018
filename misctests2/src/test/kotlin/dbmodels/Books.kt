package dbmodels

import org.jetbrains.exposed.sql.Table

object Books: Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val title = varchar("title", length = 50)
}
