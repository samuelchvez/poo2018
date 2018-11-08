package calendar

class DaysInMonth(private val year: Int, private val month: Int): Iterator<Int> {

    private var currentDay = 1

    private fun isLeapYear(y: Int): Boolean {
        return (y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)
    }

    private fun maxDaysInMonth(isLeap: Boolean, m: Int): Int {
        if (m <= 6) {
            if (m % 2 != 0) {
                if (m != 1) {
                    return 30
                }

                if (isLeap) {
                    return 29
                }

                return 28
            }

            return 31
        }

        if (m % 2 != 0) {
            return 31
        }

        return 30
    }

    override fun hasNext(): Boolean {
        return currentDay <= maxDaysInMonth(isLeapYear(year), month)
    }

    override fun next(): Int {
        return currentDay++
    }
}