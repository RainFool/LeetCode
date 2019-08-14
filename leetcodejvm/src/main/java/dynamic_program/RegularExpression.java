package dynamic_program;

public class RegularExpression {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean isFirstEquals = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() > 1 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (isFirstEquals && isMatch(s.substring(1), p));
        } else {
            if (isFirstEquals) {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                return false;
            }
        }
    }
}
