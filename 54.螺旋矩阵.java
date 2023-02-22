import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    List<Integer> ans = new ArrayList<>();

    // 1 2 3 4
    // 5 6 7 8
    // 9 10 11 12
    // 13 14 15 16
    public List<Integer> spiralOrder(int[][] matrix) {
        each(matrix, 0, 0, 1);
        return ans;
    }

    private boolean each(int[][] matrix, int r, int c, int direct) {
        if (!isValid(matrix, r, c)) {
            return false;
        }
        if (matrix[r][c] < -100) {
            return false;
        }
        ans.add(matrix[r][c]);
        matrix[r][c] = Integer.MIN_VALUE;
        if (direct == 0) {
            return false
                    || each(matrix, r - 1, c, 0)
                    || each(matrix, r, c + 1, 1)
                    || each(matrix, r + 1, c, 2)
                    || each(matrix, r, c - 1, 3);

        } else if (direct == 1) {
            return false
                    || each(matrix, r, c + 1, 1)
                    || each(matrix, r + 1, c, 2)
                    || each(matrix, r, c - 1, 3)
                    || each(matrix, r - 1, c, 0);
        } else if (direct == 2) {
            return false
                    || each(matrix, r + 1, c, 2)
                    || each(matrix, r, c - 1, 3)
                    || each(matrix, r - 1, c, 0)
                    || each(matrix, r, c + 1, 1);
        } else {
            return false
                    || each(matrix, r, c - 1, 3)
                    || each(matrix, r - 1, c, 0)
                    || each(matrix, r, c + 1, 1)
                    || each(matrix, r + 1, c, 2);
        }

    }

    private boolean isValid(int[][] grid, int r, int c) {
        return 0 <= r && r < grid.length && 0 <= c && c < grid[0].length;
    }
}
// @lc code=end
