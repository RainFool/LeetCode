/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    // dp(n) = dp[n-1] + dp[n-2]
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int p1 = 1, p2 = 2;
        for (int i = 2; i < n; i++) {
            int c = p1 + p2;
            p1 = p2;
            p2 = c;
        }
        return p2;
    }
}
// @lc code=end
