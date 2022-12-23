import java.util.Stack;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        if (height.length < 3) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int pop = stack.pop();
                while (!stack.isEmpty() && height[pop] == height[stack.peek()]) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    int left = stack.peek();
                    int h = Math.min(height[left] - height[pop], height[i] - height[pop]);
                    int w = i - left - 1;
                    int water = h * w;
                    ans += water;
                }
            }
            stack.push(i);
        }
        return ans;
    }
}
// @lc code=end
