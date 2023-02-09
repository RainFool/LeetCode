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
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            System.out.println(s.charAt(right) + ",left:" + left + ",right:" + right);
            char cur = s.charAt(right);
            int index = map.getOrDefault(cur, -1);
            if (index >= 0) {
                left = Math.max(left, index + 1);
            }
            map.put(cur, right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
// @lc code=end
