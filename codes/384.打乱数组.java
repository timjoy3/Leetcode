/*
 * @lc app=leetcode.cn id=384 lang=java
 *
 * [384] 打乱数组
 */

// @lc code=start

import java.util.Arrays;
import java.util.Random;

class Solution {

    private int[] nums;
    private Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int n = nums.length;
        int[] copy  = Arrays.copyOf(nums, n);
        for(int i = 0; i < n; i++){
            int r = i + random.nextInt(n - i);
            swap(copy, i, r);
        }
        return copy;
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp; 
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
// @lc code=end

