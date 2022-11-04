import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {

    public static final void main(String[] args) {
        int[] nums = new int[] { 2, 3, 1, 3, 3 };
        Solution solution = new Solution();
        solution.nextPermutation(nums);
        System.out.println("done");
    }

    public void nextPermutation(int[] nums) {

        if (nums == null || nums.length <= 0) {
            return;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] <= nums[i]) {
                    continue;
                }
                if (nums[j] <= min) {
                    minIndex = j;
                    min = nums[j];
                }
            }
            if (minIndex == i) {
                continue;
            } else {
                swap(nums, i, minIndex);
                reverse(nums, i + 1, nums.length - 1);
                return;
            }
        }
        // 找不到，逆序
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
// @lc code=end
