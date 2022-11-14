import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * @lc app=leetcode.cn id=30 lang=java
 *
 * [30] 串联所有单词的子串
 */

// @lc code=start
class Solution {

    // public static void main(String[] args) {
    // String[] words = new String[] { "foo", "bar" };
    // new Solution1().findSubstring("barfoothefoobarman", words);
    // }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return ans;
        }
        if (words == null || words.length == 0) {
            return ans;
        }
        int step = words[0].length();

        int cur = 0;
        while (cur <= s.length() - step * words.length) {
            List<String> copyWords = new ArrayList(words.length);
            for (int i = 0; i < words.length; i++) {
                copyWords.add(words[i]);
            }
            String next = s.substring(cur, cur + step * words.length);
            for (int i = 0; i <= next.length() - step; i += step) {
                String nextWord = next.substring(i, i + step);
                copyWords.remove(nextWord);
            }
            if (copyWords.size() == 0) {
                ans.add(cur);
            }
            cur += 1;
        }
        return ans;
    }
}
// @lc code=end
