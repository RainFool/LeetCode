import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> ans = new ArrayList();

    public List<String> generateParenthesis(int n) {

        generate("(", 1, 0, n);
        return ans;
    }

    private void generate(String r, int left, int right, int n) {
        if (r.length() >= n * 2) {
            ans.add(r);
            return;
        }
        if (left < n) {
            generate(r + "(", left + 1, right, n);
        }
        if (right < left) {
            generate(r + ")", left, right + 1, n);
        }
    }
}
// @lc code=end
