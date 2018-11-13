package dp

/*
Say you have an array for which the ith element is the price of a given stock on day i.
Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

d(i) = d(i) + A[i] - A[i-1] > 0?:0

* */
class BestTimeToBuyAndSellStock2 {

    fun maxProfit(prices: IntArray): Int {
        val dp = Array<Int>(prices.size) { 0 }
        prices.forEachIndexed { index, value ->
            if (index == 0) {
                dp[index] = 0
            } else {
                var diff = value - prices[index - 1]
                if (diff < 0) diff = 0
                dp[index] = diff + dp[index - 1]
            }
        }
        return dp.max() ?: 0
    }
}


fun main(args: Array<String>) {
//    val testArray : IntArray = intArrayOf(7,1,5,3,6,4)
    val testArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
//    val testArray : IntArray = intArrayOf(7,6,4,3,1)
    print(BestTimeToBuyAndSellStock().maxProfit(testArray))
}