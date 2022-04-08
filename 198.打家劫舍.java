/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    // dp(i) = max{dp(i-2) + nums[i],dp(i-1)}
    public int rob(int[] nums) {
        int p1 = 0,p2 = 0;
        for (int i = 0;i< nums.length;i++) {
            int cur = Math.max(p1 + nums[i], p2);
            p1 = p2;
            p2 = cur;
        }
        return p2;
    }
}
// @lc code=end

