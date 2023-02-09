import java.util.Stack;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {

    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(height[i], max);
        }
        if (max <= 0) {
            return 0;
        }
        int ans = 0;
        for (int h = 1; h <= max; h++) {
            int lastIndex = -1;
            for (int j = 0; j < height.length; j++) {
                if (height[j] >= h) {
                    if (lastIndex >= 0) {
                        ans += j - lastIndex - 1;
                    }
                    lastIndex = j;
                }
            }
            System.out.println("the " + h + "layer,ans" + ans);
        }
        return ans;
    }
}
// @lc code=end
