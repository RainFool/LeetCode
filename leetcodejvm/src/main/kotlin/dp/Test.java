package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * int main(int argc, char** argv){
 * const char* input = "
 * <dict>
 * <key>key1</key>
 * <string>value1</string>
 *
 * <key>key2</key>
 * <string>value2</string>
 *
 * </dict>
 * ";
 * <p>
 * // TODO：请在此添加代码逻辑解析input，输出input中的key/value pair
 * <p>
 * return 0;
 * }
 **/

public class Test {

    private static final String KEY = "key";
    private static final String VALUE = "string";
    private static final String DICT = "dict";

    private Stack<Character> mStack = new Stack<>();
    private Stack<Character> mValueStack = new Stack<>();
    private List<Character> mMidList = new ArrayList<>();

    private HashMap<String, String> mResultMap = new HashMap<>();

    public void fun(String input) {
        char[] array = input.toCharArray();
        String indictorKey = "";
        String indictorValue = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '<') {
                mStack.push(array[i]);
                mValueStack.pop();
                if (mValueStack.isEmpty()) {

                }
            } else if (array[i] == '>') {
                mStack.pop();
                if (indictorKey.equals(DICT)) {

                }
                mValueStack.push(array[i]);
                if (mStack.empty()) {
                    String mid = getStackString(mMidList);
                    if (mid.equals(KEY)) {
                        indictorKey = mid;
                    } else if (mid.equals(VALUE)) {
                        indictorValue = mid;
                    }
                }
                mMidList.clear();
            } else {
                mMidList.add(array[i]);
            }

        }

    }

    private String getStackString(List<Character> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
