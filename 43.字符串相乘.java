import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "0";
        }
        if (num1.length() <= 0 || num2.length() <= 0) {
            return "0";
        }
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        List<String> r = new ArrayList<>();
        for (int i = num2.length() - 1; i >= 0; i--) {
            int m = 0;
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < num2.length() - 1 - i; k++) {
                sb.insert(0, "0");
            }
            for (int j = num1.length() - 1; j >= 0; j--) {
                int n2 = c2[i] - '0';
                int n1 = c1[j] - '0';
                int mul = n2 * n1 + m;
                sb.insert(0, (mul % 10) + "");
                m = mul / 10;
            }
            if (m > 0) {
                sb.insert(0, m + "");
            }
            r.add(sb.toString());
            System.out.println("add " + sb.toString());
        }
        String ans = "";
        for (int i = 0; i < r.size(); i++) {
            ans = addNums(ans, r.get(i));
        }

        return ans;
    }

    private String addNums(String num1, String num2) {
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
