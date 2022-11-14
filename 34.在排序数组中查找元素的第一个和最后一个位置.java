/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[] { -1, -1 };
        if (nums == null || nums.length == 0) {
            return ans;
        }
        int left = 0, right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index == -1) {
            return ans;
        }
        for (int i = index; i >= 0; i--) {
            if (target == nums[i]) {
                ans[0] = i;
            } else {
                break;
            }
        }
        for (int i = index; i < nums.length; i++) {
            if (target == nums[i]) {
                ans[1] = i;
            } else {
                break;
            }
        }
        return ans;
    }
}
// @lc code=end
