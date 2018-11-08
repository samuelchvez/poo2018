package calendar

class MonthsInYear(): Iterator<Int> {
    private var currentMonth = 0
    override fun hasNext(): Boolean {
        return currentMonth < 12
    }

    override fun next(): Int {
        return currentMonth ++
    }
}