/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    // dp[i] = max{dp[i-2] + nums[i], dp[i-1]}
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(rob(nums,0,nums.length - 2),rob(nums,1,nums.length - 1));

    }

    private int rob(int[] nums, int start,int end) {
        int p1 = nums[start];
        int p2 = Math.max(nums[start],nums[start+1]);
        for(int i = start + 2;i <= end; i++) {
            int cur = Math.max(p1 + nums[i],p2);
            p1 = p2;
            p2 = cur;
        }
        return p2;
    }
}
// @lc code=end

