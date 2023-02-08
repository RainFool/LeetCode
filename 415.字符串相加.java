/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int m = 0;
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            char c1 = i < 0 ? '0' : num1.charAt(i);
            char c2 = j < 0 ? '0' : num2.charAt(j);
            int n1 = c1 - '0';
            int n2 = c2 - '0';
            int sum = n1 + n2 + m;
            sb.append(sum % 10);
            m = sum / 10;
            i--;
            j--;
        }
        if (m > 0) {
            sb.append(m);
        }
        return sb.reverse().toString();
    }
}
// @lc code=end
