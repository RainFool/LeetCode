package slidewindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        MinimumWindowSubstring driver = new MinimumWindowSubstring();
        String min = driver.minWindow("ADOBECODEBANC", "ABC");
        System.out.println("min = " + min);
    }

    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (t == null || t.length() == 0) {
            return "";
        }
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        Map<Character, Integer> needMap = new HashMap<>();

        String ans = "";

        for (char c : t.toCharArray()) {
            int count = needMap.getOrDefault(c, 0);
            needMap.put(c, count + 1);
        }

        int l = 0, r = 0;
        boolean isLastContains = false;
        while (r < s.length()) {
            if (!isLastContains) {
                char rc = s.charAt(r);
                int count = windowMap.getOrDefault(rc, 0);
                windowMap.put(rc, ++count);
            }
            boolean isContains = true;
            for (char c : needMap.keySet()) {
                if (needMap.get(c) > windowMap.getOrDefault(c, 0)) {
                    isContains = false;
                    break;
                }
            }
            isLastContains = isContains;
            if (isContains) {
                String w = s.substring(l, r + 1);
                if (w.length() < ans.length() || ans.isEmpty()) {
                    ans = w;
                }
                char lc = s.charAt(l);
                Integer li = windowMap.getOrDefault(lc, 1);
                windowMap.put(lc, --li);
                l++;
            } else {
                r++;
            }
        }
        return ans;
    }
}
