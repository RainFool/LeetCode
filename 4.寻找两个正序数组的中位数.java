/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = 0;
        int b = nums1.length - 1;
        int x = 0;
        int y = nums2.length - 1;
        while (a <= b || x <= y) {
            if (a == b && x == y) {
                return (nums1[a] + nums2[x]) / 2F;
            }
            if (a > b) {
                if (y - x <= 1) {
                    return (nums2[x] + nums2[y]) / 2F;
                }
                x++;
                y--;
                continue;
            }
            if (x > y) {
                if (b - a <= 1) {
                    return (nums1[a] + nums1[b]) / 2F;
                }
                a++;
                b--;
                continue;
            }
            if (nums1[a] < nums2[x]) {
                a++;
            } else {
                x++;
            }
            if (nums1[b] > nums2[y]) {
                b--;
            } else {
                y--;
            }
        }
        return 0;
    }
}
// @lc code=end
