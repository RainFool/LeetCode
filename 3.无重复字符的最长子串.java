import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet set = new HashSet<>();
            set.add(s.charAt(i));
            int j = i + 1;
            for (; j < s.length(); j++) {
                char cur = s.charAt(j);
                if (set.contains(cur)) {
                    result = Math.max(result, set.size());
                    break;
                }
                set.add(s.charAt(j));
            }
            if (j == s.length()) {
                result = Math.max(result, s.length() - i);
            }
        }
        return result;
    }
}
// @lc code=end
