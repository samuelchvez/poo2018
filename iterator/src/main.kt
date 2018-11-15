import calendar.DaysInMonth
import calendar.MonthsInYear
import java.util.Calendar

fun main(args: Array<String>) {
    val cal = Calendar.getInstance()
    val year = 2018

    for (month in MonthsInYear()) {
        for (day in DaysInMonth(year, month)) {
            cal.set(year, month, day)
            println(cal.time)
        }
    }
}