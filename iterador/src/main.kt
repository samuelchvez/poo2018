import factors.PrimeFactors

fun main(args: Array<String>) {
    for (i in PrimeFactors(500)) {
        println(i)
    }
}