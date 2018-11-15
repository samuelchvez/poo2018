package factors

class PrimeFactors(val number: Int): Iterator<Int> {
    private var currentFactor = 0
    private fun isPrime(n: Int): Boolean {
        if (n == 1) {
            return true
        }

        if (n > 0) {
            var factorCount = 0
            for (i in 1 .. n) {
                if (n % i == 0) {
                    factorCount ++
                }
            }

            return factorCount == 2
        }

        return false
    }

    override fun hasNext(): Boolean {
        return currentFactor < number
    }

    override fun next(): Int {
        for (i in currentFactor + 1 .. number) {
            if (number % i == 0 && isPrime(i)) {
                currentFactor = i
                return i
            }
        }

        currentFactor = number
        return number
    }
}