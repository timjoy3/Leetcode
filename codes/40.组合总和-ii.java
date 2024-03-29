/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    List<List<Integer>> res = new LinkedList<>();
    
    LinkedList<Integer> track = new LinkedList<>();

    int sum = 0;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return res;
    }

    public void backtrack(int[] nums,int target,int start) {
        if (sum == target) {
            res.add(new LinkedList<>(track));
            return;
        }
        // base case，超过目标和，直接结束
        if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i == start || nums[i] != nums[i-1]) {
                track.add(nums[i]);
                sum += nums[i];
                backtrack(nums, target, i+1);
                track.removeLast();
                sum -= nums[i];
            }
        }
    }
}
// @lc code=end

