package numbers

class DivideTwoIntegers {

    fun divide(dividend: Int, divisor: Int): Int {
        var mutableDividend = dividend
        var result = 0
        while (mutableDividend > 0) {
            mutableDividend -= divisor
            result++
        }
        return result
    }
}

fun main(args: Array<String>) {
    println(DivideTwoIntegers().divide(1,2))
//    println(numbers.DivideTwoIntegers().divide(6,2))
//    println(numbers.DivideTwoIntegers().divide(6,2))
//    println(numbers.DivideTwoIntegers().divide(6,2))
    print("gewgw")
}