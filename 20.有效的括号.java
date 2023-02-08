import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char last = stack.peek();
            if (isMatch(last, cur)) {
                stack.pop();
            } else {
                return false;
            }
            System.out.println(stack.size() + "cur:" + cur + ",last:" + last);
        }
        return stack.isEmpty();
    }

    private boolean isMatch(char a, char b) {
        if (a == '(')
            return b == ')';
        if (a == '[')
            return b == ']';
        if (a == '{') {
            return b == '}';
        }
        return false;
    }
}
// @lc code=end
