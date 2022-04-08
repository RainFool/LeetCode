/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int p1 = 1,p2 = 2;
        for (int i = 2;i < n;i ++) {
            int cur = p1 + p2;
            p1 = p2;
            p2 = cur;
        }
        return p2;
    }
}
// @lc code=end

