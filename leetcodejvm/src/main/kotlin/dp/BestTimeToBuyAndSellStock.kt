package dp

import kotlin.math.max
import kotlin.math.min

/*
Say you have an array for which the ith element is the price of a given stock on day i.
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

* */
class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var buy = Int.MAX_VALUE
        prices.forEachIndexed { index, value ->
            buy = Math.min(value, buy)
            res = Math.max(value - buy, res)
        }
        return res
    }
}

fun main(args: Array<String>) {
//    val testArray : IntArray = intArrayOf(7,1,5,3,6,4)
    val testArray : IntArray = intArrayOf(7,6,4,3,1)
    print(BestTimeToBuyAndSellStock().maxProfit(testArray))
}