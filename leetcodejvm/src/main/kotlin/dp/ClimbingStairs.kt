package dp

/*
* You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

d(1) = 1
d(2) = (1,1)(2)
d(3) = (1,1,1)(1,2)(2,1)
d(4) = (1,1,1,1)(1,2,1)(1,1,2)(2,1,1)(2,2)
dp(i) = dp(i-1) + dp(i-2)

*/
class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        val dp = Array<Int>(n + 1) { 0 }
        dp.forEachIndexed() { index, _ ->
            when (index) {
                0 -> dp[index] = 0
                1 -> dp[index] = 1
                2 -> dp[index] = 2
                else -> dp[index] = dp[index - 1] + dp[index - 2]
            }
        }
        return dp[n]
    }
}

fun main(args: Array<String>) {
    val choices = ClimbingStairs().climbStairs(4)
    println(choices)
}