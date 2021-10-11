/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }
        String result = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0;i < s.length();i++) {
            dp[i][i] = true;
            result = s.substring(i,i + 1);
        }

        for (int i = 0;i < s.length() - 1;i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
            } else {
                dp[i][i+1] = false;
            }
        }

        for (int len =3;len<=s.length();len++) {
            for (int i = 0; i < s.length() - len;i++) {
                char front = s.charAt(i);
                char end = s.charAt(i+len - 1);
                if (front == end) {
                    dp[i][i+len -1] = dp[i+1][i+len-2];
                } else {
                    dp[i][i+len -1] = false;
                }
                if(dp[i][i+len-1]) {
                    result = s.substring(i,i+len);
                }
            }
        }
        return result;
    }
}
// @lc code=end

