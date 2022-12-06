import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {

    // public static final void main(String args[]) {
    // int[] a = new int[] { 2, 3, 6, 7 };
    // new Solution39().combinationSum(a, 7);
    // }

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return ans;
        }
        dfs(new ArrayList<>(), candidates, 0, target);
        return ans;
    }

    private void dfs(List<Integer> list, int[] candidates, int begin, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
        } else {
            for (int i = begin; i < candidates.length; i++) {
                int cur = candidates[i];
                if (cur <= target) {
                    list.add(cur);
                    dfs(list, candidates, i, target - cur);
                }
            }
        }
        if (list.size() > 0) {
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end
