import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] ans = new int[intervals.length][2];
        int index = -1;
        for (int i = 0; i < intervals.length; i++) {
            int[] array = intervals[i];

            if (index < 0 || array[0] > ans[index][1]) {
                index++;
                ans[index] = array;
            } else {
                ans[index][1] = Math.max(ans[index][1], array[1]);
            }
        }
        return Arrays.copyOf(ans, index + 1);
    }

    private boolean isCross(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            return false;
        }
        return a[a.length - 1] > b[0];
    }

    private int[] merge(int[] a, int[] b) {
        if (a.length == 0) {
            return b;
        } else if (b.length == 0) {
            return a;
        }
        return new int[] { a[0], b[1] };
    }
}
// @lc code=end
