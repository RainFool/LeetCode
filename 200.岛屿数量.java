/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (dfs(grid, r, c)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean dfs(char[][] grid, int r, int c) {
        if (!inArea(grid, r, c)) {
            return false;
        }
        if (grid[r][c] != '1') {
            return false;
        }
        grid[r][c] = 2;
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
        return true;
    }

    private boolean inArea(char[][] grid, int r, int c) {
        return 0 <= r && r < grid.length && 0 <= c && c < grid[0].length;
    }
}
// @lc code=end
